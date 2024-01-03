package 백준.실버.실버4.Ex1388;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N, M;
    public static char[][] board;
    public static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    cnt++;
                    dfs(j, i);
                }
            }
        }

        System.out.println(cnt);
    }

    public static void dfs(int x, int y) {
        if (visited[y][x]) return;
        visited[y][x] = true;

        if (board[y][x] == '-') {
            int nx = x + 1;
            if (nx < M && board[y][nx] == '-') dfs(nx, y);
        } else {
            int ny = y + 1;
            if (ny < N && board[ny][x] == '|') dfs(x, ny);
        }
    }
}
