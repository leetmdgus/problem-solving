package 백준.골드.골드3.Ex11779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static int[] dist;
    static int[] route;
    static ArrayList<Node>[] nodes;

    static class Node {
        int n, w;

        public Node(int n, int w) {
            this.n = n;
            this.w = w;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        dist = new int[N + 1];
        route = new int[N + 1];
        nodes = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            nodes[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            nodes[a].add(new Node(b, c));
        }


        StringTokenizer st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        dijkstra(v1);
        System.out.println(dist[v2]);

        ArrayList<Integer> routes = new ArrayList<>();
        int current = v2;
        while (current != 0) {
            routes.add(current);
            current = route[current];
        }
        System.out.println(routes.size());
        for (int i = routes.size() - 1; i >= 0; i--) {
            System.out.print(routes.get(i) + " ");
        }
    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.w));
        pq.add(new Node(start, 0));

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node curr = pq.poll();

            if(curr.w > dist[curr.n]) continue;

            for (Node next : nodes[curr.n]) {
                if (dist[next.n] > dist[curr.n] + next.w) {
                    dist[next.n] = dist[curr.n] + next.w;
                    route[next.n] = curr.n;
                    pq.add(next);
                }
            }
        }
    }
}
