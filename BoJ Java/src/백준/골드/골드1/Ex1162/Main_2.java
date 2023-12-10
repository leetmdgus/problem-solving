package 백준.골드.골드1.Ex1162;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2 {
    public static int N, M, K;
    public static long[][] dp;

    public static ArrayList<Edge>[] edges;

    static class Edge {
        int end, count;
        long cost;

        public Edge(int end, long cost, int count) {
            this.end = end;
            this.count = count;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        init();
        dijkstra();
        System.out.println(findMin());
    }

    public static long findMin() {
        long min = Long.MAX_VALUE;
        for(long a: dp[N]) {
            min = Math.min(min, a);
        }
        return min;
    }

    private static void dijkstra() {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingLong(o->o.cost));
        pq.add(new Edge(1, 0, 0));
        dp[1][0] = 0;

        while(!pq.isEmpty()) {
            Edge now = pq.poll();
            if(now.cost > dp[now.end][now.count]) continue;

            for(Edge next : edges[now.end]) {
                long nextCost = now.cost + next.cost;

                if(nextCost < dp[next.end][now.count]) {
                    dp[next.end][now.count] = nextCost;
                    pq.add(new Edge(next.end, nextCost, now.count));
                }

                if(now.count < K && now.cost < dp[next.end][now.count+1]) {
                    dp[next.end][now.count+1] = now.cost;
                    pq.add(new Edge(next.end, now.cost, now.count+1));
                }
            }
        }
    }

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        edges = new ArrayList[N+1];
        dp = new long[N+1][K+1];

        for(int i = 1; i<=N ;i++) {
            edges[i] = new ArrayList<>();
            Arrays.fill(dp[i], Long.MAX_VALUE);
        }

        for(int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            edges[s].add(new Edge(e, c, 0));
            edges[e].add(new Edge(s, c, 0));
        }
    }

}

