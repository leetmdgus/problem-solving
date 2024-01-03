package 백준.골드.골드2.Ex12015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 기존 LIS를 하면 시간 초과 발생
// 값이 중요한 것이 아닌 길이가 중요함.
// 추가 대치를 통한 방법 사용.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // process
        int maxLength = 0;

        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (dp[maxLength] < arr[i]) { // 추가
                maxLength++;
                dp[maxLength] = arr[i];

            } else { // 이분탐색 -> 대치
                int start = 0;
                int end = maxLength;

                while (start <= end) {
                    int mid = (end + start) / 2;

                    if (arr[i] < dp[mid]) {
                        end = mid-1;
                    } else if (arr[i] > dp[mid]){
                        start = mid+1;
                    } else {
                        start = mid; break;
                    }
                }
                dp[start] = arr[i];
            }
        }

        // output
        System.out.println(maxLength+1);
    }
}
