package 백준.브론즈.브론즈3.Ex30821;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long res = C(n, 5);
        System.out.println(res);
    }

    public static long C(int n, int r) {
        long res = n;

        if (r == 0 || n == r) {
            return 1;
        }

        for (int i = 1; i < r; i++) {
            res *= (n - i);
        }

        return res / factorial(r);
    }

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
