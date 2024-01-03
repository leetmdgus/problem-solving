package 백준.실버.실버1.Ex2468;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int[][] board;
    public static boolean[][] visited;

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        board = new int[n][n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, board[i][j]);
                max = Math.max(max, board[i][j]);
            }
        }

        int res = 0;
        for(int level = min; level <= max; level++) {
            int count = 0;
            visited = new boolean[n][n];

            for(int i = 0; i<n; i++) {
                for(int j = 0; j<n; j++) {
                    if(board[i][j] >= level && !visited[i][j]) {
                        count++;
                        dfs(level, j, i);
                    }
                }
            }

            res = Math.max(res, count);
        }
        System.out.println(res);
    }

    public static void dfs(int level, int x, int y) {
        visited[y][x] = true;

        for(int idx = 0; idx < 4; idx++) {
            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if(nx < 0 || ny < 0 || nx >= n || ny >= n) {
                continue;
            }

            if(board[ny][nx] >= level && !visited[ny][nx]) {
                dfs(level, nx, ny);
            }
        }
    }
}