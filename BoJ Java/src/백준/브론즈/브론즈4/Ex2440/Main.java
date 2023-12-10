package 백준.브론즈.브론즈4.Ex2440;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String star = "*";
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                sb.append(star);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
