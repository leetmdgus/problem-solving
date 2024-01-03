package 백준.브론즈.브론즈1.Ex1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        for(int i = 0; i<t; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int max = GCD(Math.max(a, b), Math.min(a, b));
            int min = a*b/max;
            sb.append(min).append('\n');
        }
        System.out.println(sb);
    }
    public static int GCD(int n, int r) {
        if( r== 0) {
            return n;
        }
        return GCD(r, n%r);
    }
}
