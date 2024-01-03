package 백준.실버.실버3.Ex1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        recursive(n);

        System.out.println(dp[n]);
    }

    public static int recursive(int n) {
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(Math.min(recursive(n / 3), recursive(n / 2)), recursive(n - 1)) +1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(recursive(n / 3), recursive(n - 1)) +1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(recursive(n / 2), recursive(n - 1)) +1;
            } else {
                dp[n] = recursive(n - 1) +1;
            }
        }
        return dp[n];
    }
}
