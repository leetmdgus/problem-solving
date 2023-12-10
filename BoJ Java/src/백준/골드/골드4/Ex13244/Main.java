package 백준.골드.골드4.Ex13244;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static long M;
    static int[] parents;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            N = Integer.parseInt(br.readLine());
            M = Integer.parseInt(br.readLine());

            parents = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                parents[i] = i;
            }

            boolean isTree = true;
            for (int i = 0; i < M; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if (find(a) == find(b)) {
                    isTree = false;
                } else {
                    union(a, b);
                }
            }

            for (int i = 1; i < N; i++) {
                if (find(i) != find(i + 1)) {
                    isTree = false;
                }
            }

            sb.append(isTree ? "tree" : "graph").append('\n');
        }

        System.out.println(sb);
    }

    public static int find(int a) {
        if (parents[a] == a) return a;
        else return parents[a] = find(parents[a]);

    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a == b) return;

        parents[Math.min(a, b)] = Math.max(a, b);
    }
}
