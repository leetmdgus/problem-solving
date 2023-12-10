package 백준.실버.실버4.Ex13699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[36];
        arr[0] = 1;
        arr[1] = 1; // arr[0] * arr[0]
        arr[2] = 2; // arr[0] * arr[1] + arr[1] * arr[0];
        arr[3] = 5; // arr[0] * arr[2] + arr[1] * arr[1] + arr[2] * arr[0];

        for (int i = 4; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                arr[i] += arr[j] * arr[i-j-1];
            }
        }
        System.out.println(arr[n]);
    }
}
