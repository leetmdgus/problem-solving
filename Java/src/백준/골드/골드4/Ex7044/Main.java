package 백준.골드.골드4.Ex7044;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] parent;

    static PriorityQueue<Edge> edges = new PriorityQueue<>(((o1, o2) -> (int) (o2.w - o1.w)));

    static class Edge {
        int a, b;
        long w;

        public Edge(int a, int b, long w) {
            this.a = a;
            this.b = b;
            this.w = w;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) parent[i] = i;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long w = Integer.parseInt(st.nextToken());

            edges.add(new Edge(Math.min(a, b), Math.max(a, b), w));
        }

        long res = 0;
        while (!edges.isEmpty()) {
            Edge now = edges.poll();
            if (find(now.a) == find(now.b)) continue;

            union(now.a, now.b);
            res += now.w;
        }
        for(int i = 1; i<N; i++) {
            if(find(i) != find(i+1)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(res);
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
