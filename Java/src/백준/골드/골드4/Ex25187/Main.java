package 백준.골드.골드4.Ex25187;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, Q;
    static int[] parent;
    static int[] cleanWater, dirtyWater;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        cleanWater = new int[N + 1];
        dirtyWater = new int[N + 1];
        parent = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int water = Integer.parseInt(st.nextToken());
            if (water == 1) cleanWater[i]++;
            else            dirtyWater[i]++;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            union(u, v);
        }

        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int tank = Integer.parseInt(br.readLine());
            tank = find(tank);

            if (cleanWater[tank] > dirtyWater[tank]) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
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

        int min = Math.min(x, y);
        int max = Math.max(x, y);

        cleanWater[min] += cleanWater[max];
        cleanWater[max] = 0;
        dirtyWater[min] += dirtyWater[max];
        dirtyWater[max] = 0;

        parent[max] = min;
    }
}
