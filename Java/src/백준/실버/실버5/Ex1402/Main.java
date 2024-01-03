package 백준.실버.실버5.Ex1402;

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
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A == B) {
                sb.append("no").append("\n");
                continue;
            }

            boolean flag = false;
            for (int i = 1; i <= A / 2; i++) {
                if (A % i == 0 && (A / i) + i == B) {
                    flag = true;
                    break;
                }
            }

            sb.append(flag ? "yes" : "no").append("\n");
        }

        System.out.println(sb);
    }
}
