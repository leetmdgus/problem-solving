package 백준.골드.골드3.Ex4386;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int n;

    static class XY {
        double x, y;

        public XY(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Edge {
        XY p1, p2;
        double w;

        public Edge(XY p1, XY p2, double w) {
            this.p1 = p1;
            this.p2 = p2;
            this.w = w;
        }
    }

    static ArrayList<XY> xyArrayList = new ArrayList<>();
    static PriorityQueue<Edge> distances;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        parent = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());

            xyArrayList.add(new XY(x, y));
            parent[i] = i;
        }


        distances = new PriorityQueue<>(Comparator.comparingDouble(o->o.w));
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                distances.add(new Edge(xyArrayList.get(i), xyArrayList.get(j), distance(xyArrayList.get(i), xyArrayList.get(j))));
            }
        }

        double cost = 0;
        int cnt = 0;
        while (!distances.isEmpty()) {
            if(cnt == n-1) break;

            Edge now = distances.poll();

            int idx1 = xyArrayList.indexOf(now.p1);
            int idx2 = xyArrayList.indexOf(now.p2);

            if(find(idx1) == find(idx2)) continue;
            union(idx1, idx2);

            cost += now.w;
        }

        System.out.println(cost);
    }

    public static int find(int x) {
        if (parent[x] == x) return x;
        else return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x == y) return;

        int max = Math.max(x, y);
        int min = Math.min(x, y);
        parent[max] = min;
    }


    public static double distance(XY p1, XY p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}
