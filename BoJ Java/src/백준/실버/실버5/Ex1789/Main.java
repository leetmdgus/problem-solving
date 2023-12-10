package 백준.실버.실버5.Ex1789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        for (int i = 1;; i++) {
            n -= i;

            if(n == 0) {
                System.out.println(i);
                return;
            } else if (n < 0) {
                System.out.println(i-1);
                return;
            }
        }
    }
}
