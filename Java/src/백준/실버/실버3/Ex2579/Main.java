package 백준.실버.실버3.Ex2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n == 1) {
            System.out.println(br.readLine());
            return;
        }

        int[] arr = new int[n + 1];
        int[][] dp = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1][1] = arr[1];

        dp[2][1] = arr[2];
        dp[2][2] = arr[2] + arr[1]; // 연속으로 두 번 한 계단씩 오르는 경우

        for (int i = 3; i <= n; i++) {
            dp[i][1] = arr[i] + Math.max(dp[i - 2][1], dp[i - 2][2]);
            dp[i][2] = arr[i] + dp[i - 1][1];
        }

        System.out.println(Math.max(dp[n][1], dp[n][2]));
    }
}
