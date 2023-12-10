package 백준.실버.실버3.Ex9711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger[] fibo = new BigInteger[10001];
        fibo[1] = BigInteger.ONE;
        fibo[2] = BigInteger.ONE;

        for (int i = 3; i <= 10000; i++) {
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
        }

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            sb.append("Case #" + i + ": ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            long q = Long.parseLong(st.nextToken());
            sb.append(fibo[p].mod(new BigInteger(String.valueOf(q))));
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
