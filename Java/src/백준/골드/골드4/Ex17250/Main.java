package 백준.골드.골드4.Ex17250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] parent;
    static int[] canUse;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) parent[i] = i;

        canUse = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            canUse[i] = Integer.parseInt(br.readLine());
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(find(a) == find(b)) {
                sb.append(canUse[find(a)]).append('\n');
                continue;
            }

            union(a, b);
            sb.append(canUse[find(a)]).append('\n');
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

        canUse[Math.min(x, y)] += canUse[Math.max(x, y)];
        canUse[Math.max(x, y)] = 0;
    }
}
