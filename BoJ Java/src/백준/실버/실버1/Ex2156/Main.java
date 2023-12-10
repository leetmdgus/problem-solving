package 백준.실버.실버1.Ex2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int[][] dp = new int[10001][3];

        dp[1][1] = arr[1];
        max = Math.max(max, dp[1][1]);

        dp[2][1] = arr[2];
        dp[2][2] = dp[1][1] + arr[2];

        for (int i = 3; i <= n; i++) {
            dp[i][1] = max + arr[i];
            dp[i][2] = dp[i - 1][1] + arr[i];

            if (dp[i - 1][1] > max || dp[i - 1][2] > max) {
                max = Math.max(dp[i - 1][1], dp[i - 1][2]);
            }
        }

        for (int i = 1; i <= n; i++) {
            max = Math.max(max, Math.max(dp[i][1], dp[i][2]));
        }
        System.out.println(max);
    }
}
