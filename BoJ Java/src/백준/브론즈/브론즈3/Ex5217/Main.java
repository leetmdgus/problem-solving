package 백준.브론즈.브론즈3.Ex5217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append("Pairs for " + n + ": ");

            int a = 1, b = n - 1;

            while (a < b) {
                if (!(a == 1 && b == n - 1)) sb.append(", ");
                sb.append(a++ + " " + b--);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
