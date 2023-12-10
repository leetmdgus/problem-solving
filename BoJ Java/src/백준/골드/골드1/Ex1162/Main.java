package 백준.골드.골드1.Ex1162;

import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K;
    static long[][] dp;

    static ArrayList<Edge>[] edges;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        edges = new ArrayList[N + 1];
        dp = new long[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            edges[i] = new ArrayList<>();
            Arrays.fill(dp[i], Long.MAX_VALUE);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            edges[s].add(new Edge(e, c, 0));
            edges[e].add(new Edge(s, c, 0));
        }

        dijkstra();

        long min = Long.MAX_VALUE;
        for (long a : dp[N]) {
            min = Math.min(a, min);
        }

        System.out.println(min);
    }

    static void dijkstra() {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingLong(o -> o.cost));
        pq.add(new Edge(1, 0, 0));
        dp[1][0] = 0;

        while (!pq.isEmpty()) {
            Edge now = pq.poll();
            if (now.cost > dp[now.end][now.count]) continue;

            for (Edge next : edges[now.end]) {
                long nextCost = next.cost + now.cost;

                if (nextCost < dp[next.end][now.count]) {
                    dp[next.end][now.count] = nextCost;
                    pq.add(new Edge(next.end, nextCost, now.count));
                }

                if (now.count < K && now.cost < dp[next.end][now.count + 1]) {
                    dp[next.end][now.count + 1] = now.cost;
                    pq.add(new Edge(next.end, now.cost, now.count + 1));
                }
            }
        }
    }
}


class Edge {
    int end;
    long cost;
    int count;

    public Edge(int end, long cost, int count) {
        this.end = end;
        this.cost = cost;
        this.count = count;
    }
}