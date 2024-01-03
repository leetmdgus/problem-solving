package 백준.브론즈.브론즈3.Ex2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int c = Integer.parseInt(br.readLine());

            int q = 0, d = 0, n = 0, p = 0;
            q = c / 25;
            c %= 25;

            d = c / 10;
            c %= 10;

            n = c / 5;
            c %= 5;

            p = c / 1;

            sb.append(q + " " + d + " " + n + " " + p + "\n");
        }
        System.out.println(sb);
    }
}
