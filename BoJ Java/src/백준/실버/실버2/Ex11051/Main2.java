package 백준.실버.실버2.Ex11051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static final int div =  10007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        System.out.println(((factorial(n) % div) * modInverse(factorial(r)*factorial(n-r) % div , div)) % div);
    }
    public static int factorial(int n) {
        int ans = 1;
        for(int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }


    public static int modInverse(int a, int p) {
        int ans = 1;
        for(int i = 1; i<=p-2; i++) {
            ans *= a;
        }
        return ans%p;
    }
}
