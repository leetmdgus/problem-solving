package 백준.브론즈.브론즈2.Ex25373;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        if (n < 21) {
            if (n < 21) {
                for (int i = 1; ; i++) {
                    long sum = (i + 1) * i / 2;

                    if (sum >= n) {
                        System.out.println(i);
                        return;
                    }
                }
            }

            long x = n / 7;
            long y = n % 7;

            System.out.println((y == 0) ? x + 3 : x + 4);
        }
    }
}
