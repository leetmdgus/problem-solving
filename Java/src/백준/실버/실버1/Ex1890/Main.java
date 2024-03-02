package 백준.실버.실버1.Ex1890;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] arr;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N + 1][N + 1];
        dp = new long[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(dfs(1, 1));
    }

    static int[] dx = {0, 1};
    static int[] dy = {1, 0};

    public static long dfs(int x, int y) {
        if (x == N && y == N) {
            return 1;
        }

        if (dp[y][x] != -1) {
            return dp[y][x];
        }

        dp[y][x] = 0;
        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i] * arr[y][x];
            int ny = y + dy[i] * arr[y][x];

            if (nx < 1 || ny < 1 || nx > N || ny > N) continue;
            dp[y][x] += dfs(nx, ny);
        }

        return dp[y][x];
    }
}
