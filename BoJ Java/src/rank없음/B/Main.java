package rank없음.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            if (n == m) {
                sb.append(0).append('\n');
            }

            int sec = 1;
            long a = n;
            long b = 2;

            while (a != b) {
                sec++;
                a--;
                b++;
                if (a == 0) {
                    a = n;
                }
                if (b == m + 1) {
                    b = 1;
                }
            }
            sb.append(sec).append('\n');
        }

        System.out.println(sb);
    }
}