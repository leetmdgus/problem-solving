package 백준.실버.실버4.Ex12847;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        long[] dp = new long[n];
        long money = 0;

        st= new StringTokenizer(br.readLine());
        for(int i = 0; i<m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            money += arr[i];
        }
        dp[m-1] = money;

        for(int i = m; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = dp[i-1] + arr[i] - arr[i-m];
            money = Math.max(dp[i], money);
        }

        System.out.println(money);
    }
}
