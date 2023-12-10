package 백준.골드.골드3.Ex1238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int N, M, X;
    public static long[] dp1;
    public static long[] dp2;

    public static ArrayList<Edge>[] edges;
    public static ArrayList<Edge>[] reverseEdges;

    static class Edge {
        int end, cost;

        public Edge(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        edges = new ArrayList[N + 1];
        reverseEdges = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            edges[i] = new ArrayList<>();
            reverseEdges[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            edges[s].add(new Edge(e, t));
            reverseEdges[e].add(new Edge(s, t));
        }

        dp1 = dijkstra(edges);
        dp2 = dijkstra(reverseEdges);

        long max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, dp1[i] + dp2[i]);
        }
        System.out.println(max);
    }

    public static long[] dijkstra(ArrayList<Edge>[] list) {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingLong(o -> o.cost));
        pq.add(new Edge(X, 0));

        long[] dp = new long[N + 1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[X] = 0;

        while (!pq.isEmpty()) {
            Edge now = pq.poll();
            if(now.cost > dp[now.end]) continue;

            for(Edge next : list[now.end]) {
                int nextCost = next.cost + now.cost;

                if(nextCost < dp[next.end]) {
                    dp[next.end] = nextCost;
                    pq.add(new Edge(next.end, nextCost));
                }
            }
        }

        return dp;
    }
}
