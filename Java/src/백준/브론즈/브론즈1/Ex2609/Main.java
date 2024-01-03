package 백준.브론즈.브론즈1.Ex2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        int max = GCD(Math.max(a, b), Math.min(a, b));
        int min = a * b / max;
        System.out.println(max);
        System.out.println(min);

    }
    public static int GCD(int n, int r) {
        if(r == 0) {
            return n;
        }
        return GCD(r, n%r);
    }
}
