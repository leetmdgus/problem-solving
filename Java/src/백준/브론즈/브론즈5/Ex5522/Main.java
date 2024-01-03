package 백준.브론즈.브론즈5.Ex5522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger i1 = new BigInteger(br.readLine());
        BigInteger i2 = new BigInteger(br.readLine());
        BigInteger i3 = new BigInteger(br.readLine());
        BigInteger i4 = new BigInteger(br.readLine());
        BigInteger i5 = new BigInteger(br.readLine());


        BigInteger sum = i1.add(i2).add(i3).add(i4).add(i5);
        System.out.println(sum);
    }
}
