package 백준.골드.골드5.Ex13398;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[][] dp = new int[n + 1][2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1][0] = arr[1];
        dp[1][1] = 0;
        dp[2][0] = dp[1][0] + arr[2];
        dp[2][1] = Math.max(dp[1][1] + arr[2], dp[1][0]);

        for (int i = 3; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i];
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1] + arr[i]);
        }

        System.out.println(Math.max(dp[n][0], dp[n][1]));
    }
}
