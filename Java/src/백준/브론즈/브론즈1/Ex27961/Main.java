package 백준.브론즈.브론즈1.Ex27961;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        if (n <= 1) {
            System.out.println(n);
            return;
        }

        long current = 1;
        int cnt = 1;

        while (current < n) {
            current *= 2;
            cnt++;
        }

        System.out.println(cnt);
    }
}
