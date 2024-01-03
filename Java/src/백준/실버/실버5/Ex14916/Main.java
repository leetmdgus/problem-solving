package 백준.실버.실버5.Ex14916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int five = 0;
        int two = 0;


        five += n / 5;
        n %= 5;

        if (n % 2 != 0) {
            five--;
            two += 2;
            n++;
        }

        if(five < 0) {
            System.out.println(-1);
            return;
        }

        two += n / 2;
        n %= 2;

        System.out.println(two + five);
    }
}
