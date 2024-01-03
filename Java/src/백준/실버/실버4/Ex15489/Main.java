package 백준.실버.실버4.Ex15489;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        BigInteger[] bigInteger = S(k,n).divideAndRemainder(BigInteger.valueOf(1_000_000_007));
        System.out.println(bigInteger[1]);
    }
    public static BigInteger S(int k, int n) {
        if(k == 0) {
            return BigInteger.valueOf(n);
        }

        BigInteger bigInteger = new BigInteger("0");
        for(int i = 1; i<=n; i++) {
            bigInteger = bigInteger.add(S(k-1, i));
        }
        return bigInteger;
    }
}
