package 백준.골드.골드3.Ex1774;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static int[] parent;
    static XY[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new XY[N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new XY(x, y);
        }

        PriorityQueue<Edge> edges = new PriorityQueue<>(Comparator.comparingDouble(o -> o.w));
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                double d = distance(arr[i], arr[j]);
                edges.add(new Edge(i, j, d));
            }
        }

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) parent[i] = i;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            union(a, b);
        }

        Set set = new HashSet();
        for (int i = 1; i <= N; i++) {
            set.add(find(i));
        }

        double cost = 0;
        int edgeCnt = set.size() - 1;
        while (!edges.isEmpty()) {
            if (edgeCnt == 0) break;

            Edge now = edges.poll();
            if (find(now.p1) == find(now.p2)) continue;

            union(now.p1, now.p2);
            edgeCnt--;
            cost += now.w;
        }

        String res = String.format("%.2f", cost);
        System.out.println(res);
    }

    static int find(int x) {
        if (parent[x] == x) return x;
        else return parent[x] = find(parent[x]);
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) return;

        parent[Math.max(x, y)] = Math.min(x, y);
    }

    static class XY {
        int x, y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Edge {
        int p1, p2;
        double w;

        public Edge(int p1, int p2, double w) {
            this.p1 = p1;
            this.p2 = p2;
            this.w = w;
        }
    }

    static double distance(XY p1, XY p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}
