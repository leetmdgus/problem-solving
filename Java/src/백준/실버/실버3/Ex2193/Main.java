package 백준.실버.실버3.Ex2193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[][] dp = new long[91][2];
        dp[1][1] = 1; // 1자리 이친수 1
        dp[2][0] = 1; // 2자리 이친수 10

        dp[3][0] = dp[2][0] + dp[2][1]; // 2자리 2친수에 0추가
        dp[3][1] = dp[2][0]; //2자리 이친수 끝이 0일때만 1 추가

        for (int i = 4; i <= n; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }

        System.out.println(dp[n][0] + dp[n][1]);
    }
}
