package 백준.실버.실버5.Ex2167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int[][] dp = new int[n][m];
        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if(i == 0 && j ==0 ) {
                    dp[0][0] = arr[0][0];
                } else if(i == 0){
                    dp[i][j] = dp[i][j-1] + arr[i][j];
                } else if(j == 0) {
                    dp[i][j] = dp[i-1][j] + arr[i][j];
                } else {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j] + arr[i][j] - dp[i-1][j-1];
                }
            }
        }
        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(k-->0) {
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken())-1;
            int i = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            int x = Integer.parseInt(st.nextToken())-1;

            int sum;
            if(i == 0 && j == 0) {
                sum = dp[y][x];
            } else if(i == 0) {
                sum = dp[y][x] - dp[j-1][x];
            } else if(j == 0) {
                sum = dp[y][x] - dp[y][i-1];
            } else {
                sum = dp[y][x] - dp[y][i-1] - dp[j-1][x] + dp[j-1][i-1];
            }

            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}
