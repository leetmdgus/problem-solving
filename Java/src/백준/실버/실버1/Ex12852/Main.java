package 백준.실버.실버1.Ex12852;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 3];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[1] = 0;
        arr[2] = arr[3] = 1;

        for (int i = 4; i <= n; i++) {
            if (i % 3 == 0) {
                arr[i] = Math.min(arr[i / 3] + 1, arr[i]);
            }
            if (i % 2 == 0) {
                arr[i] = Math.min(arr[i / 2] + 1, arr[i]);
            }
            arr[i] = Math.min(arr[i - 1] + 1, arr[i]);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(arr[n]).append('\n');
        sb.append(n).append(' ');

        while (n != 1) {
            if (n % 3 == 0 && arr[n / 3] == arr[n] - 1) {
                sb.append(n / 3).append(' ');
                n /= 3;
            } else if (n % 2 == 0 && arr[n / 2] == arr[n] - 1) {
                sb.append(n / 2).append(' ');
                n /= 2;
            } else if (arr[n - 1] == arr[n] - 1) {
                sb.append(n - 1).append(' ');
                n -= 1;
            }
        }

        System.out.println(sb);
    }
}
