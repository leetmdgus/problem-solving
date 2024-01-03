package 백준.실버.실버3.Ex9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long[] arr = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init();

        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n]).append("\n");
        }
        System.out.println(sb);
    }

    public static void init() {
        arr[1] = arr[2] = arr[3] = 1;
        arr[4] = arr[5] = 2;

        for (int i = 6; i <= 100; i++) {
            arr[i] = arr[i - 1] + arr[i - 5];
        }
    }
}
