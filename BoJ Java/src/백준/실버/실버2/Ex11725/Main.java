package 백준.실버.실버2.Ex11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static ArrayList<Integer>[] nodes;
    public static int[] parent;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        nodes = new ArrayList[N + 1];
        parent = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            nodes[v1].add(v2);
            nodes[v2].add(v1);
        }

        bfs();

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        parent[1] = -1;

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int next : nodes[now]) {
                if (parent[next] == 0) {
                    q.add(next);
                    parent[next] = now;
                }
            }
        }
    }
}
