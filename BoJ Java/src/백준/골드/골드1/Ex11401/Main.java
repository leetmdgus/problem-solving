package 백준.골드.골드1.Ex11401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long div = 1_000_000_007;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long numer = factorial(N);
        long denom = factorial(K) * factorial(N-K) % div;
        System.out.println(numer * pow(denom, div-2) % div);
    }

    public static long factorial(long n) {
        long ans = 1;
        for(int i= 1; i<=n; i++) {
            ans =  (ans * i) % div;
        }
        return ans;
    }

    public static long pow(long A, long exponent) {
        if(exponent == 1) {
            return A % div;
        }

        long tmp = pow(A, exponent/2);


        if(exponent % 2 == 1) {
            return ((tmp * tmp)%div * (A % div))%div;  // (tmp * tmp * A) % div
        }
        return tmp * tmp % div;   // tmp * tmp % div
    }
}
