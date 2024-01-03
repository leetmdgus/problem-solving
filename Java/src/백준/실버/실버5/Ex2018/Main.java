package 백준.실버.실버5.Ex2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1) {
            System.out.println(1);
            return;
        }

        int p1 = 0;
        int p2 = 1;

        int count = 1;
        int sum = 1;

        while(p1 <= n && p2 <=n && p1 < p2) {
            if(sum > n) {
                sum -= p1;
                p1++;
            } else if(sum <=n) {
                if(sum == n) {
                    count++;
                }
                p2++;
                sum += p2;
            }
        }

        System.out.println(count);
    }
}
