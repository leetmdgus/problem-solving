package 백준.실버.실버3.Ex1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[][] countArr = new int[41][2]; // 0 count / 1 count

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        countArr[0][0] = 1;
        countArr[1][1] = 1;

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            sb.append(countArr[n][0] + " " + countArr[n][1]).append("\n");
        }

        System.out.println(sb);
    }

    public static void fibonacci(int n) {
        if (n == 0 || n == 1) {
            return;
        }

        if (countArr[n][0] != 0 || countArr[n][1] != 0) {
            return;
        }

        for (int i = 2; i <= n; i++) {
            countArr[i][0] = countArr[i - 1][0] + countArr[i - 2][0];
            countArr[i][1] = countArr[i - 1][1] + countArr[i - 2][1];
        }
    }
}
