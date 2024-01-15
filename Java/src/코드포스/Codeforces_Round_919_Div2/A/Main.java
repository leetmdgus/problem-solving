package 코드포스.Codeforces_Round_919_Div2.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long min = 0;
            long max = Long.MAX_VALUE;
            List<Long> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                long x = Long.parseLong(st.nextToken());

                if (a == 1) {
                    min = Math.max(min, x);
                } else if (a == 2) {
                    max = Math.min(max, x);
                } else {
                    list.add(x);
                }
            }

            long cnt = max - min + 1;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < min || list.get(i) > max) continue;
                cnt--;
            }

            sb.append(cnt < 0 ? 0 : cnt).append('\n');
        }

        System.out.println(sb);
    }
}
