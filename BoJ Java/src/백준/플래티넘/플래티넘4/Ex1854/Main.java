package 백준.플래티넘.플래티넘4.Ex1854;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, K;
    static PriorityQueue<Integer>[] visited;
    static ArrayList<Node>[] nodes;


    static class Node {
        int p, w;

        public Node(int p, int w) {
            this.p = p;
            this.w = w;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new PriorityQueue[N + 1];
        nodes = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            visited[i] = new PriorityQueue(Comparator.reverseOrder());
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            nodes[a].add(new Node(b, w));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.w));
        pq.add(new Node(1, 0));
        visited[1].add(0);

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            for (Node next : nodes[now.p]) {
                if (visited[next.p].size() < K) {
                    visited[next.p].add(now.w + next.w);
                    pq.add(new Node(next.p, now.w + next.w));
                } else if (visited[next.p].peek() > now.w + next.w) {
                    visited[next.p].poll();
                    visited[next.p].add(now.w + next.w);
                    pq.add(new Node(next.p, now.w + next.w));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (visited[i].size() < K) sb.append(-1).append('\n');
            else sb.append(visited[i].peek()).append('\n');
        }
        System.out.println(sb);
    }
}
