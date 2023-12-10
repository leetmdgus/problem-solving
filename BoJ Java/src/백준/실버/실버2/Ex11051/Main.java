package 백준.실버.실버2.Ex11051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N, K;
    public static final long div = 10_007;
    public static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dp = new int[N+1][K+1];

        System.out.println(c(N, K));
    }

    public static long c(int n, int r) {
        if(dp[n][r] > 0)  {
            return dp[n][r];
        }

        if( n == r || r == 0) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = (int) ((c(n - 1, r - 1) + c(n - 1, r)) % div);
    }
}
