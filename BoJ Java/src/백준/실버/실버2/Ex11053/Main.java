package 백준.실버.실버2.Ex11053;

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
        int[] dp = new int[n]; // 각각 인덱스에 가장 긴 증가하는 수열 넣기
        Arrays.fill(dp, 1);

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int totalMax = 0;
        for (int i = 0; i < n; i++) {
            totalMax = Math.max(totalMax, dp[i]);
        }

        System.out.println(totalMax);
    }
}
