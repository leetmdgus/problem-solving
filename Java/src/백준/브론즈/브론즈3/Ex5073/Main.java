package 백준.브론즈.브론즈3.Ex5073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;
            if (!isValid(a, b, c))                  sb.append("Invalid\n");
            else if (a == b && b == c)              sb.append("Equilateral \n");
            else if (a == b || b == c || c == a)    sb.append("Isosceles \n");
            else                                    sb.append("Scalene \n");
        }
        System.out.println(sb);
    }

    public static boolean isValid(int a, int b, int c) {
        int max = 0;
        int m1, m2;
        if (a >= b && a >= c) {
            max = a; m1 = b; m2 = c;
        } else if (b >= a && b >= c) {
            max = b; m1 = a; m2 = c;
        } else {
            max = c; m1 = a; m2 = b;
        }

        return max < m1 + m2;
    }
}
