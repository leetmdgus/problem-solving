package 브론즈1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex11050 {
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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(combination(N,K));
    }
}
