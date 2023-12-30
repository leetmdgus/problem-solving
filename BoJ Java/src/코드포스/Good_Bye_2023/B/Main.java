package 코드포스.Good_Bye_2023.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long gcd = GCD(b, a);

            if(a == 1 || b== 1) {
                sb.append(Math.max(a*a, b*b)).append('\n');
            } else if (b % a == 0 || a % b == 0) {
                long min = Math.min(a, b);
                long max = Math.max(a, b);
                min = Math.min(min, max / min);

                sb.append((a*b)/gcd * min).append('\n');
            } else {
                sb.append((a*b)/gcd).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static long GCD(long num1, long num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return GCD(num2, num1 % num2);
    }
}
