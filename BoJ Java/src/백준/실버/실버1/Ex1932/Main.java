package 백준.실버.실버1.Ex1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr;
    public static int[][] dp;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n+1][n+1];
        dp = new int[n+1][n+1];

        for(int i = 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<=i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(i == n-1) {
                    dp[i][j] = arr[i][j];
                }
            }
        }

        setDp(dp.length-2);
        System.out.println(dp[0][0]);
    }

    public static void setDp(int level) {
        if(level < 0){
            return;
        }
        if (level == 0) {
            dp[0][0] = arr[0][0] + Math.max(dp[1][0], dp[1][1]);
        }

        for(int i = 0; i<n; i++) {
            dp[level][i] = arr[level][i] + Math.max(dp[level+1][i], dp[level+1][i+1]);
        }
        setDp(level-1);
    }
}
