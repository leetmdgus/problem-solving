package 백준.실버.실버4.Ex2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int three = 3;
        int five = 5;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        while (n >= five) {
            if (n == 6 || n == 9 || n == 12) {
                break;
            }
            count++;
            n -= five;
        }
        while (n >= three) {
            count++;
            n -= three;
        }
        System.out.println(n == 0 ? count : -1);
    }
}

