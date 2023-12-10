package 백준.브론즈.브론즈3.Ex2442;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        StringBuilder star = new StringBuilder("*");

        for (int j = 1; j <= n; j++) {
            for (int i = 0; i < n - j; i++) {
                sb.append(' ');
            }
            sb.append(star);
            star.append("**");
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
