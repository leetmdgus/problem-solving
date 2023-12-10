package 백준.브론즈.브론즈3.Ex10214;

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
            int y = 0;
            int k = 0;
            for (int i = 1; i <= 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                y += Integer.parseInt(st.nextToken());
                k += Integer.parseInt(st.nextToken());
            }

            if (y == k) {
                sb.append("Draw").append('\n');
            } else if (y > k) {
                sb.append("Yonsei").append('\n');
            } else {
                sb.append("Korea").append('\n');
            }
        }

        System.out.println(sb);
    }
}
