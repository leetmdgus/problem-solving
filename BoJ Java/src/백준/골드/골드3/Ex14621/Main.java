package 백준.골드.골드3.Ex14621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static String[] arr; // boys. girls

    static int[] parent;
    static PriorityQueue<Edge> edges;

    static class Edge {
        int p1, p2;
        int w;

        public Edge(int p1, int p2, int w) {
            this.p1 = p1;
            this.p2 = p2;
            this.w = w;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new String[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = st.nextToken();
        }

        edges = new PriorityQueue<>(Comparator.comparingInt(o -> o.w)); // 남자 여자 연결되어 있을때만 edge추가
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int idx1 = Integer.parseInt(st.nextToken());
            int idx2 = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if (arr[idx1].equals(arr[idx2])) continue;

            edges.add(new Edge(Math.min(idx1, idx2), Math.max(idx1, idx2), d));
        }

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) parent[i] = i;

        int edgeCnt = N - 1;
        int cost = 0;
        while (!edges.isEmpty()) {
            if (edgeCnt == 0) break;

            Edge now = edges.poll();

            if (find(now.p1) == find(now.p2)) continue;

            union(now.p1, now.p2);
            cost += now.w;
            edgeCnt--;
        }

        System.out.println(edgeCnt == 0 ? cost : -1);
    }

    public static int find(int x) {
        if (x == parent[x]) return x;
        else return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x == y) return;

        parent[Math.max(x, y)] = Math.min(x, y);
    }
}
