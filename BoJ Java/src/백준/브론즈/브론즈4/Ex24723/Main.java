package 백준.브론즈.브론즈4.Ex24723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];

        if(n == 1) {
            System.out.println(2);
            return;
        }

        dp[1] = 2;
        dp[2] = 4;

        for(int i = 3; i<=n; i++) {
            dp[i] = 2 * dp[i-1];
        }
        System.out.println(dp[n]);
    }
}
