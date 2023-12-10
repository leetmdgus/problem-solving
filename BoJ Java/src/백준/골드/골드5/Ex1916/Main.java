package 백준.골드.골드5.Ex1916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, S, E;
    static ArrayList<Edge>[] edges;
    static long[] dp;

    static class Edge {
        int end;
        long cost;

        public Edge(int end, long cost) {
            this.end = end;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        init();
        dijkstra();

        System.out.println(dp[E]);
    }

    public static void dijkstra() {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingLong(o -> o.cost));
        pq.add(new Edge(S, 0));

        while(!pq.isEmpty()) {
            Edge now = pq.poll();

            if(now.cost > dp[now.end]) continue;

            for(Edge next : edges[now.end]) {
                long nextCost = next.cost + now.cost;

                if(nextCost < dp[next.end]) {
                    dp[next.end] = nextCost;
                    pq.add(new Edge(next.end, nextCost));
                }
            }
        }

    }
    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        edges = new ArrayList[N + 1];
        dp = new long[N + 1];

        for(int i = 1; i<=N; i++) {
            edges[i] = new ArrayList<>();
            dp[i] = Long.MAX_VALUE;
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            edges[s].add(new Edge(e, c));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
    }
}
