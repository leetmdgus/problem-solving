package 백준.골드.골드5.Ex2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static int n;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dfs("");
        System.out.println(sb);
    }

    public static void dfs(String str) {
        if(str.length() == n) {
            sb.append(str + " \n");
            return;
        }

        for(int i = 1; i<=9; i++) {
            int num = Integer.parseInt(str+i);
            if(isPrime(num)) {
                dfs(str + i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
