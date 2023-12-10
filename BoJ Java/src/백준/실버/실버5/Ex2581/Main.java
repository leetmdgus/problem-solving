package 백준.실버.실버5.Ex2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = n; i<=m; i++) {
            if(isPrime(i)) {
                sum += i;
                min = Math.min(i, min);
            }
        }

        System.out.println(sum == 0 ? -1 : sum + "\n" + min);
    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2) return true;

        for(int i = 2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
