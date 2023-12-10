package 백준.브론즈.브론즈1.Ex2851;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 10;

        int[] dp = new int[n];

        int score = 0;
        dp[0] = Integer.parseInt(br.readLine());

        if (Math.abs(score - 100) > Math.abs(dp[0] - 100)) {
            score = dp[0];
        }

        for (int i = 1; i < 10; i++) {
            dp[i] = dp[i-1] + Integer.parseInt(br.readLine());
            if (Math.abs(score - 100) >= Math.abs(dp[i] - 100)) {
                score = dp[i];
            }
        }
        System.out.println(score);
    }
}
