package 백준.실버.실버5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1010 {
    static long factorial(int n) {
        if(n <2) {
            return 1;
        }
        return n * factorial(n-1);
    }
    static long permutation(int n, int r) {
        long result = 1;
        for(int i = n; i>=n-r+1; i--) {
            result *= i;
        }
        return result;
    }

    static long combination(int n, int r) {
        if(r > n/2) {
            r = n-r;
        }
        return permutation(n, r)/factorial(r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        while(repeat-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int n = M;
            int r = N;
            System.out.println(combination(n, r));
        }
    }
}
