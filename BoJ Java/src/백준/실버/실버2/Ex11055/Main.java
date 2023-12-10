package 백준.실버.실버2.Ex11055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] sum = new int[n]; // 증가하는 부분수열의 합의 최댓값

        // input
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = arr[i]; // 여기 조심.
        }

        // process
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && sum[i] < sum[j] + arr[i]) { // 증가할때.
                    sum[i] = sum[j] + arr[i];
                }
            }
        }

        // result
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(sum[i], maxSum);
        }

        System.out.println(maxSum);
    }
}
