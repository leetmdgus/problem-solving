package 백준.골드.골드5.Ex2170;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2 {
    public static int N, K;
    public static final long C = 1_000_000_007;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        long a = factorial(N);
        long b = factorial(K);
        long c = factorial(N-K);

        System.out.println(a / b / c);
    }

    public static long factorial(long A) {
        long ans = 1;

        for(int i = 1; i<=A; i++) {
            ans = (ans % C) * (i % C) % C;
        }

        return ans % C;
    }
}
