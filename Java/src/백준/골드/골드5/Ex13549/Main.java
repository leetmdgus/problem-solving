package 백준.골드.골드5.Ex13549;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int min = Integer.MAX_VALUE;
    static int n, k;
    static boolean[] visited = new boolean[100001];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        bfs();
        System.out.println(min);
    }

    public static void bfs() {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(n, 0));

        while(!q.isEmpty()) {
            Node node = q.poll();
            visited[node.x] = true;

            if(node.time >= min) continue;

            if(node.x == k) {
                min = Math.min(min, node.time);
            }

            if(node.x * 2 < visited.length && !visited[node.x * 2]) {
                q.offer(new Node(node.x * 2, node.time));
            }
            if(node.x + 1 < visited.length && !visited[node.x + 1]) {
                q.offer(new Node(node.x + 1, node.time + 1));
            }
            if(node.x - 1 >= 0 && !visited[node.x - 1]) {
                q.offer(new Node(node.x - 1, node.time + 1));
            }
        }
    }

    public static class Node {
        int x;
        int time;

        public Node(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }
}