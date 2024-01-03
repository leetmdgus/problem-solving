package 코드포스.Good_Bye_2023.A;

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
            boolean flag = true;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int value = 2023;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (value % a != 0) {
                    flag = false;
                } else {
                    value /= a;
                }
            }

            if (!flag) {
                sb.append("NO").append('\n');
            } else {
                sb.append("YES").append('\n');
                int[] arr = new int[k];
                for (int i = 0; i < k; i++) {
                    arr[i] = 1;
                }

                int idx = 0;
                while (value != 1 && idx < k) {
                    for (int i = value; i >= 1; i--) {
                        if (value % i == 0) {
                            arr[idx++] = i;
                            value /= i;
                        }
                        if (idx >= k) break;
                    }
                }

                for (int i = 0; i < k; i++) {
                    sb.append(arr[i]).append(' ');
                }
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}
