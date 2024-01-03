package 백준.골드.골드5.Ex2589;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int[][] map; // land 1 w : -1
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int max;
    public static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                map[i][j] = (str.charAt(j) == 'L') ? 1 : -1;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1) {
                    bfs(j, i);
                }
            }
        }

        System.out.println(max);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        q.add(new int[]{x, y, 0});
        visited[y][x] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();

            max = Math.max(max, now[2]);

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if (visited[ny][nx] || map[ny][nx] == -1) continue;

                visited[ny][nx] = true;
                q.add(new int[]{nx, ny, now[2] + 1});
            }
        }
    }
}
