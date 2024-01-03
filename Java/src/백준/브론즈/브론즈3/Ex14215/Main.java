package 백준.브론즈.브론즈3.Ex14215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = 0;
        int m1 = 0, m2 = 0;
        if (a >= b && a >= c) {
            max = a;m1 = b;m2 = c;
        } else if (b >= a && b >= c) {
            max = b; m1 = a;m2 = c;
        } else {
            max = c; m1 = a;m2 = b;
        }

        if(max > m1+m2-1) {
            max = m1 + m2 - 1;
        }


        System.out.println(max + m1 + m2);
    }
}
