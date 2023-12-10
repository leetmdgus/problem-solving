package 백준.실버.실버5.Ex9625;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[46][3];

        dp[0][1] = 1;
        dp[0][2] = 0;
        dp[1][1] = 0;
        dp[1][2] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
            dp[i][2] = dp[i-1][2] + dp[i-2][2];
        }

        System.out.println(dp[n][1] + " " + dp[n][2]);
    }
}
