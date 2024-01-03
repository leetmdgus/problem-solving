package 백준.골드.골드4.Ex1504;

import java.util.*;
import java.io.*;

public class Main {
    static class Node {
        int n, w;

        public Node(int n, int w) {
            this.n = n;
            this.w = w;
        }
    }

    static ArrayList<Node>[] nodes;
    static int N, M;
    static int[] dist;
    static final int INF = 200_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nodes = new ArrayList[N + 1];
        dist = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            nodes[a].add(new Node(b, c));
            nodes[b].add(new Node(a, c));
        }

        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        int res1 = 0;
        res1 += dijkstra(1, v1);
        res1 += dijkstra(v1, v2);
        res1 += dijkstra(v2, N);

        int res2 = 0;
        res2 += dijkstra(1, v2);
        res2 += dijkstra(v2, v1);
        res2 += dijkstra(v1, N);

        System.out.println(res1 >= INF && res2 >= INF ? -1 : Math.min(res1, res2));
    }

    public static int dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.w));
        pq.add(new Node(start, 0));

        Arrays.fill(dist, INF);
        dist[start] = 0;

        boolean[] check = new boolean[N + 1];

        while (!pq.isEmpty()) {
            Node currNode = pq.poll();
            check[currNode.n] = true;

            for (Node next : nodes[currNode.n]) {
                if(!check[next.n] && dist[next.n] > dist[currNode.n] + next.w) {
                    dist[next.n] = dist[currNode.n] + next.w;
                    pq.add(new Node(next.n, dist[next.n]));
                }
            }
        }

        return dist[end];
    }
}