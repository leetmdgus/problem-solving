package 백준.골드.골드5.Ex1717;

// 자료 구조 // 분리 집합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] parent;
    static StringBuilder sb= new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];

        for(int i = 1; i<=N; i++) parent[i] = i;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(order == 0) {
                union(a, b);
            } else {
                sb.append(isSameParent(a, b) ? "YES" : "NO").append('\n');
            }
        }

        System.out.println(sb);
    }

    public static int find(int x) {
        if(x == parent[x]) return x;
        return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        int min = Math.min(x, y);
        int max = Math.max(x, y);

        parent[max] = min;
    }

    public static boolean isSameParent(int x, int y) {
        return find(x) == find(y);
    }
}
