package 백준.실버.실버5.Ex1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        int count = 0;
        for(int i = 0; i<n ;i++) {
            if(isPrime(Integer.parseInt(st.nextToken()))) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if( n == 1) {
            return false;
        }
        for(int i = 2; i<n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
