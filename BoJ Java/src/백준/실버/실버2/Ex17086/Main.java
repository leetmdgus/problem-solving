package 백준.실버.실버2.Ex17086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] board;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        dp = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i][j] == 1) {
                    bfs(j, i);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(dp[i][j] != Integer.MAX_VALUE) {
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        System.out.println(max);
    }

    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {1, 0, -1, 1, -1, 1, 0, -1};

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y, 0});
        boolean[][] visited = new boolean[N][M];

        while (!q.isEmpty()) {
            int[] now = q.remove();

            for (int i = 0; i < 8; i++) {
                int nx = dx[i] + now[0];
                int ny = dy[i] + now[1];

                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if (board[ny][nx] == 1 || visited[ny][nx]) continue;

                visited[ny][nx] = true;
                dp[ny][nx] = Math.min(dp[ny][nx], now[2] + 1);
                q.add(new int[]{nx, ny, now[2] + 1});
            }
        }
    }
}
