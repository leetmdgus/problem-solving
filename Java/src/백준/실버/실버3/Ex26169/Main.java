package 백준.실버.실버3.Ex26169;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] board = new int[5][5];
    public static boolean[][] visited = new boolean[5][5];
    public static int[] dx = {0, -1, 1, 0};
    public static int[] dy = {1, 0, 0, -1};
    public static int r, c;
    public static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        visited[r][c] = true;

        dfs(0, c, r, 0);
        System.out.println(res);
    }

    public static void dfs(int depth, int x, int y, int eat) {
        if (board[y][x] == 1) eat++;
        if (eat >= 2)   res = 1;
        if (depth == 3) return;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5) continue;
            if (board[ny][nx] == -1 || visited[ny][nx]) continue;

            visited[y][x] = true;
            dfs(depth + 1, nx, ny, eat);
            visited[y][x] = false;
        }
    }
}

