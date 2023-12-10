package 백준.실버.실버4.Ex2407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        BigInteger answer = c(n, m);
        System.out.println(answer);
    }

    public static BigInteger c(int n, int m) {
        if(n == 1 || n == m) {
            return new BigInteger("1");
        }
        return c(n-1, m).add(c(n-1, m-1));
    }
}
