package 백준.골드.골드4.Ex1744;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        if (n == 1) {
            System.out.println(br.readLine());
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
        }

        int idx1 = arr.length - 1;
        int idx2 = arr.length - 2;

        while ((idx1 >= 0 && idx2 >= 0) && arr[idx1] > 1 && arr[idx2] > 1) {
            dp[idx2] = (arr[idx1] * arr[idx2]);
            dp[idx1] = 0;
            idx1 -= 2;
            idx2 -= 2;
        }

        idx1 = 0;
        idx2 = 1;
        while ((idx1 < arr.length && idx2 < arr.length) && arr[idx1] <= 0 && arr[idx2] <= 0) {
            dp[idx1] = (arr[idx1] * arr[idx2]);
            dp[idx2] = 0;
            idx1 += 2;
            idx2 += 2;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += dp[i];
        }
        System.out.println(sum);
    }
}
