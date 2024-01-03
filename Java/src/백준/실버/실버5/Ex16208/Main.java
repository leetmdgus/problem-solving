package 백준.실버.실버5.Ex16208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0; i<n; i++) {
            if(i == 0) dp[i] = arr[i];
            else dp[i] = dp[i-1] + arr[i];
        }

        long sum = 0;
        for(int i = 0; i<n; i++) {
            sum += arr[i] * (dp[n-1] - dp[i]);
        }
        System.out.println(sum);
    }
}
