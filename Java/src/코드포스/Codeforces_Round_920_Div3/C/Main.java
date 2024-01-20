package 코드포스.Codeforces_Round_920_Div3.C;

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
            int n = Integer.parseInt(st.nextToken()); // 주어질 숫자 갯수
            long f = Long.parseLong(st.nextToken()); // 초기 충전 정보
            long a = Long.parseLong(st.nextToken()); // 단위 시간당 소모 배터리
            long b = Long.parseLong(st.nextToken()); // 전원 off on 시 소모 배터리

            long[] arr = new long[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }

            boolean flag = true;

            for (int i = 1; i <= n; i++) {
                if ((arr[i] - arr[i - 1]) * a > b) {
                    f -= b;
                } else {
                    f -= (arr[i] - arr[i - 1]) * a;
                }

                if (f <= 0) {
                    flag = false;
                }
            }

            if(flag) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }
}
