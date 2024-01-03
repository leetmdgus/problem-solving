package 백준.골드.골드5.Ex7511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N, K, M;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tesCaseCnt = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tesCaseCnt; t++) {
            sb.append("Scenario " + t + ":").append('\n');

            N = Integer.parseInt(br.readLine());
            parent = new int[N + 1];
            for (int i = 1; i <= N; i++) parent[i] = i;

            K = Integer.parseInt(br.readLine());
            for (int i = 0; i < K; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                union(a, b);
            }

            M = Integer.parseInt(br.readLine());
            for (int i = 0; i < M; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                sb.append(find(a) == find(b) ? 1 : 0).append('\n');
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static int find(int x) {
        if (x == parent[x]) return x;
        else return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) return;

        parent[Math.max(x, y)] = Math.min(x, y);
    }
}
