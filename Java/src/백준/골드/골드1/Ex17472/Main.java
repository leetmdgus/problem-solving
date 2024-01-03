package 백준.골드.골드1.Ex17472;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int landCnt;
    static int[][] board;

    static int N, M;

    static class Land {
        int minX, maxX;
        int minY, maxY;

        public Land(int minX, int maxX, int minY, int maxY) {
            this.minX = minX;
            this.maxX = maxX;
            this.minY = minY;
            this.maxY = maxY;
        }
    }

    static int index;
    static Map<Land, Integer> indexes = new HashMap<>();

    static Land[] lands;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        lands = new Land[10];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && board[i][j] == 1) {
                    landCnt++;
                    bfs(i, j);
                }
            }
        }

        PriorityQueue<Edge> edges = new PriorityQueue<>(Comparator.comparingInt(o -> o.w));
        for (int i = 0; i < landCnt; i++) {
            for (int j = 0; j < landCnt; j++) {
                Land l1 = lands[i];
                Land l2 = lands[j];
                edges.add(new Edge(l1, l2, distance(l1, l2)));
            }
        }

        parent = new int[landCnt];
        for (int i = 0; i < landCnt; i++) parent[i] = i;

        int edgeCnt = landCnt - 1;
        int cost = 0;

        while (!edges.isEmpty()) {
            if (edgeCnt == 0) break;

            Edge now = edges.poll();
            if (now.w <= 1) continue;

            int idx1 = indexes.get(now.p1);
            int idx2 = indexes.get(now.p2);

            if (find(idx1) == find(idx2)) continue;

            union(idx1, idx2);
            cost += now.w;
            edgeCnt--;
        }

        System.out.println(edgeCnt == 0 ? cost : -1);
    }

    static class Edge {
        Land p1, p2;
        int w;

        public Edge(Land p1, Land p2, int w) {
            this.p1 = p1;
            this.p2 = p2;
            this.w = w;
        }
    }

    static boolean[][] visited;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void bfs(int y, int x) {
        int minX = x, maxX = 0;
        int minY = y, maxY = 0;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if (visited[ny][nx] || board[ny][nx] == 0) continue;

                visited[ny][nx] = true;
                queue.add(new int[]{nx, ny});
                maxX = Math.max(maxX, nx);
                maxY = Math.max(maxY, ny);
            }
        }

        Land now = new Land(minX, maxX, minY, maxY);
        lands[index] = now;
        indexes.put(now, index++);
    }

    static int distance(Land l1, Land l2) {
        int diffX = 0;
        int diffY = 0;

        if(l1.maxX >= l2.maxX && l1.minX <= l2.minX) diffY = Math.min(Math.abs(l1.maxY - l2.minY) , Math.abs(l1.minY - l2.maxY))-1;
        if(l1.maxX >= l2.minX && l1.minX <= l2.maxX) diffY = Math.min(Math.abs(l1.maxY - l2.minY) , Math.abs(l1.minY - l2.maxY))-1;
        if(l1.maxX >= l2.minX && l1.maxX <= l2.minY) diffY = Math.min(Math.abs(l1.maxY - l2.minY) , Math.abs(l1.minY - l2.maxY))-1;

        if(l1.minY <= l2.minY && l1.maxY >= l2.maxY) diffX = Math.min(Math.abs(l1.maxX - l2.minX), Math.abs(l1.minX - l2.maxX))-1;
        if(l1.minY <= l2.maxY && l1.maxY >= l2.minY) diffX = Math.min(Math.abs(l1.maxX - l2.minX), Math.abs(l1.minX - l2.maxX))-1;
        if(l1.maxY <= l2.minY && l1.maxY >= l2.minY) diffX = Math.min(Math.abs(l1.maxX - l2.minX), Math.abs(l1.minX - l2.maxX))-1;

        if(diffX <= 1) {
            return diffY;
        } else if(diffY <= 1){
            return diffX;
        } else {
            return Math.min(diffX, diffY);
        }
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
}
