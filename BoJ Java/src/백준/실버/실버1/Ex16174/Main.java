package 백준.실버.실버1.Ex16174;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] dx = {1, 0};
    public static int[] dy = {0, 1};

    public static int[][] board;
    public static boolean[][] visited;
    public static int n;

    public static boolean isWin;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        board = new int[n][n];
        visited = new boolean[n][n];

        for(int i =0;i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(isWin ? "HaruHaru" : "Hing");
    }

    public static void dfs(int x, int y) {
        if(board[y][x] == -1) {
            isWin = true;
            return;
        }

        int m = board[y][x];
        for(int idx = 0; idx < 2; idx++){
            int nx = x + m * dx[idx];
            int ny = y + m * dy[idx];

            if(nx < 0 || ny < 0 || nx >= n || ny >= n) {
                continue;
            }

            if(!visited[ny][nx]) {
                visited[ny][nx] = true;
                dfs(nx, ny);
            }
        }
    }
}
