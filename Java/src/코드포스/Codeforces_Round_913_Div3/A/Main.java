package 코드포스.Codeforces_Round_913_Div3.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String str = br.readLine();
            char letter = str.charAt(0);
            int digit = str.charAt(1) - '0';

            for (char i = 'a'; i <= 'h'; i++) {
                if (letter == i) continue;

                sb.append(i).append(digit).append('\n');
            }
            for (int i = 1; i <= 8; i++) {
                if (i == digit) continue;

                sb.append(letter).append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
