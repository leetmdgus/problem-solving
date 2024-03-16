package 백준.골드.골드4.Ex14923;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static int hx, hy, ex, ey;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        hy = Integer.parseInt(st.nextToken()) - 1;
        hx = Integer.parseInt(st.nextToken()) - 1;

        st = new StringTokenizer(br.readLine());
        ey = Integer.parseInt(st.nextToken()) - 1;
        ex = Integer.parseInt(st.nextToken()) - 1;

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{hx, hy, 0, 0});
        visited[hy][hx] = true;

        while (!q.isEmpty()) {
            int[] now = q.remove();

            if (now[0] == ex && now[1] == ey) {
                return now[2];
            }

            ArrayList<X> x = new ArrayList<>();
            Collections.sort(x, Comparator.comparingDouble(o -> o.x));
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + now[0];
                int ny = dy[i] + now[1];

                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if (visited[ny][nx]) continue;
                if (map[ny][nx] == 1 && now[3] == 1) continue;

                visited[ny][nx] = true;

                if (map[ny][nx] == 1) {
                    q.add(new int[]{nx, ny, now[2] + 1, now[3] + 1});
                } else {
                    q.add(new int[]{nx, ny, now[2] + 1, now[3]});
                }
            }
        }

        return -1;
    }
    static class X {
        int x, y;

        public X(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
