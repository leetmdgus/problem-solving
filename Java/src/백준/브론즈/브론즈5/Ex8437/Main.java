package 백준.브론즈.브론즈5.Ex8437;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        BigInteger m = new BigInteger(br.readLine());

        if (n.remainder(BigInteger.TWO).equals(BigInteger.ONE)) {
            System.out.println(n.divide(BigInteger.TWO).add(m.divide(BigInteger.TWO)).add(BigInteger.ONE));
            System.out.println(n.divide(BigInteger.TWO).subtract(m.divide(BigInteger.TWO)));
        } else {
            System.out.println(n.divide(BigInteger.TWO).add(m.divide(BigInteger.TWO)));
            System.out.println(n.divide(BigInteger.TWO).subtract(m.divide(BigInteger.TWO)));
        }
    }
}
