package 백준.골드.골드4.Ex1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int V, E, I;
    static ArrayList<Edge>[] edges;
    static long[] dp;

    static class Edge {
        int e, cost;

        public Edge(int e, int cost) {
            this.e = e;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        I = Integer.parseInt(br.readLine());

        dp = new long[V + 1];
        edges = new ArrayList[V + 1];

        for (int i = 1; i <= V; i++) {
            edges[i] = new ArrayList<>();
            dp[i] = Long.MAX_VALUE;
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            edges[u].add(new Edge(v, w));
        }

        dijkstra();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            sb.append(dp[i] != Long.MAX_VALUE ? dp[i] : "INF").append("\n");
        }
        System.out.println(sb);
    }

    public static void dijkstra() {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));

        pq.add(new Edge(I, 0));
        dp[I] = 0;

        while (!pq.isEmpty()) {
            Edge now = pq.poll();
            if (now.cost > dp[now.e]) continue;

            for (Edge next : edges[now.e]) {
                int nextCost = next.cost + now.cost;

                if (nextCost < dp[next.e]) {
                    dp[next.e] = nextCost;
                    pq.add(new Edge(next.e, nextCost));
                }
            }
        }
    }
}