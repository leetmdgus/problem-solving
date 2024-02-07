package 코드포스.Codeforces_Round_923_Div3.A;

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
            String str = br.readLine();

            int start = 0;
            int end = 0;

            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'B') {
                    if (cnt == 0) {
                        start = i;
                    }
                    end = i;
                    cnt++;
                }
            }
            if(cnt == 0) {
                sb.append(0).append('\n');
            } else {
                sb.append(end - start + 1).append('\n');
            }
        }
        System.out.println(sb);
    }
}
