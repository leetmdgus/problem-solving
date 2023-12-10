package 백준.실버.실버5.Ex13241;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long max = gcd(Math.max(a, b), Math.min(a, b));
        long min = a * b / max;

        System.out.println(min);
    }

    public static long gcd(long n, long r) {
        if (r == 0) {
            return n;
        }
        return gcd(r, n % r);
    }
}
