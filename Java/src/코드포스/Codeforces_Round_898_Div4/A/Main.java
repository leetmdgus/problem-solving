package 코드포스.Codeforces_Round_898_Div4.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] possibleABC = {"abc", "acb", "bac", "cba"};
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String str = br.readLine();
            boolean flag = false;
            for (int i = 0; i < 4; i++) {
                if (str.equals(possibleABC[i])) {
                    flag = true;
                }
            }

            if (flag) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);

    }
}
