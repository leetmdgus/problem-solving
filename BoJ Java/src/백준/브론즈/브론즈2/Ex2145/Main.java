package 백준.브론즈.브론즈2.Ex2145;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            while (n / 10 != 0) {
                int sum = 0;

                while (n / 10 != 0) {
                    sum += n % 10;
                    n /= 10;
                }
                sum += n % 10;

                n = sum;
            }
            sb.append(n).append('\n');
        }

        System.out.println(sb);
    }
}
