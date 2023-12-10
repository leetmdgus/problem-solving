package 백준.브론즈.브론즈2.Ex10996;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                sb.append('*').append(' ');
            }
            sb.append('\n');
            for (int i = 1; i <= n / 2; i++) {
                sb.append(' ').append('*');
            }
        } else {
            for (int i = 0; i <= n / 2; i++) {
                sb.append('*').append(' ');
            }
            sb.append('\n');
            for (int i = 1; i <= n / 2; i++) {
                sb.append(' ').append('*');
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(sb);
        }
    }
}
