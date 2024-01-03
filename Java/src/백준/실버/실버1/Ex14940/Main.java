package 백준.실버.실버1.Ex14940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] arr;
    static boolean[][] visited;

    static XY goal;

    static class XY {
        int x, y, d;

        public XY(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int info = Integer.parseInt(st.nextToken());
                if (info == 2) {
                    goal = new XY(j, i, 0);
                    info = 0;
                } else if(info == 1) {
                    info = -1;
                }
                arr[i][j] = info;
            }
        }

        bfs();

        StringBuilder sb= new StringBuilder();
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<M; j++) {
                sb.append(arr[i][j] + " ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void bfs() {
        Queue<XY> q = new LinkedList<>();
        q.add(goal);
        visited[goal.y][goal.x] = true;

        while (!q.isEmpty()) {
            XY now = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if (visited[ny][nx] || arr[ny][nx] == 0) continue;

                visited[ny][nx] = true;
                arr[ny][nx] = now.d + 1;

                q.add(new XY(nx, ny, now.d + 1));
            }
        }
    }
}
