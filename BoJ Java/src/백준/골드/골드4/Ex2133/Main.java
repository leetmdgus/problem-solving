package 백준.골드.골드4.Ex2133;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dp = new int[31];
        dp[0] = 1;
        dp[2] = 3;
        dp[4] = dp[2] * dp[2] + dp[0] * 2;

        for (int i = 6; i <= 30; i += 2) {
            dp[i] = (dp[i - 2] * 3);
            for(int j = 4; j<=i; j+=2) {
                dp[i] += (dp[i - j]*2);
            }
        }

        int n = Integer.parseInt(br.readLine());

        System.out.println(dp[n]);
    }
}
