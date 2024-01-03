package 백준.플래티넘.플래티넘5.Ex2887;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static ArrayList<XYZ> xyzArrayList = new ArrayList<>();
    static Map<XYZ, Integer> indexes = new HashMap<>();
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            XYZ now = new XYZ(x, y, z);

            xyzArrayList.add(now);
            indexes.put(now, i);
        }

        parent = new int[N];
        for(int i = 0; i<N ;i++) parent[i] = i;

        PriorityQueue<Edge> edges = new PriorityQueue<>(Comparator.comparingInt(o -> o.w));

        Collections.sort(xyzArrayList, Comparator.comparingInt(o -> o.x)); /// x정렬
        for (int i = 0; i < N-1; i++) {
            int diff = Math.abs(xyzArrayList.get(i).x - xyzArrayList.get(i+1).x);
            edges.add(new Edge(xyzArrayList.get(i), xyzArrayList.get(i+1), diff));
        }

        Collections.sort(xyzArrayList, Comparator.comparingInt(o -> o.y)); /// y정렬
        for (int i = 0; i < N-1; i++) {
            int diff = Math.abs(xyzArrayList.get(i).y - xyzArrayList.get(i+1).y);
            edges.add(new Edge(xyzArrayList.get(i), xyzArrayList.get(i+1), diff));
        }

        Collections.sort(xyzArrayList, Comparator.comparingInt(o -> o.z)); /// z정렬
        for (int i = 0; i < N-1; i++) {
            int diff = Math.abs(xyzArrayList.get(i).z - xyzArrayList.get(i+1).z);
            edges.add(new Edge(xyzArrayList.get(i), xyzArrayList.get(i+1), diff));
        }

        int edgeCnt = 0;
        long cost = 0;
        while(!edges.isEmpty()) {
            if(edgeCnt == N-1) break;

            Edge now = edges.poll();

            if(find(indexes.get(now.p1)) == find(indexes.get(now.p2))) continue;

            union(indexes.get(now.p1), indexes.get(now.p2));
            cost+= now.w;
            edgeCnt++;
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

        parent[Math.max(x, y)] = Math.min(x, y);
    }

    static class Edge {
        XYZ p1, p2;
        int w;

        public Edge(XYZ p1, XYZ p2, int w) {
            this.p1 = p1;
            this.p2 = p2;
            this.w = w;
        }
    }

    static class XYZ {
        int x, y, z;

        public XYZ(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

    }
}
