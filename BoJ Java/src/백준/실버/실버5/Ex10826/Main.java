package 백준.실버.실버5.Ex10826;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger[] bigIntegers = new BigInteger[n + 3];
        bigIntegers[0] = BigInteger.ZERO;
        bigIntegers[1] = BigInteger.ONE;
        bigIntegers[2] = BigInteger.ONE;

        for (int i = 3; i <= n; i++) {
            bigIntegers[i] = bigIntegers[i-1].add(bigIntegers[i-2]);
        }

        System.out.println(bigIntegers[n]);
    }
}
