package 백준.골드.골드2.Ex12738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        long[] dp = new long[n];

        // input
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // process
        dp[0] = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (dp[maxIndex] < arr[i]) { // 추가
                maxIndex++;
                dp[maxIndex] = arr[i];
            } else { // 이분 탐색, 대치
                int left = 0;
                int right = maxIndex;

                while (left <= right) {
                    int mid = (left + right) / 2;

                    if (arr[i] < dp[mid]) {
                        right = mid - 1;
                    } else if (arr[i] > dp[mid]) {
                        left = mid + 1;
                    } else {
                        left = mid;break;
                    }
                }
                dp[left] = arr[i];
            }
        }

        // result
        System.out.println(maxIndex + 1);
    }
}
