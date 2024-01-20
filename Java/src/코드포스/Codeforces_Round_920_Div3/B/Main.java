package 코드포스.Codeforces_Round_920_Div3.B;

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
            String str1 = br.readLine();
            String str2 = br.readLine();

            int haveToErase = 0;
            int haveToAdd = 0;

            for (int i = 0; i < n; i++) {
                int c1 = str1.charAt(i);
                int c2 = str2.charAt(i);

                if (c1 == '0' && c2 == '1') {
                    haveToAdd++;
                } else if (c1 == '1' && c2 == '0') {
                    haveToErase++;
                }
            }

            sb.append(Math.max(haveToErase, haveToAdd)).append('\n');
        }

        System.out.println(sb);
    }
}
