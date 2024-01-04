package 코드포스.Codeforces_Round_917_Div2.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }
            Arrays.sort(arr);

            int minusCnt = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) {
                    minusCnt++;
                }
            }

            if (minusCnt % 2 == 0) {
                boolean flag = false;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 0) {
                        flag = true;
                    }
                }
                if (flag) {
                    sb.append(0);
                } else {
                    sb.append(1 + "\n");
                    if (minusCnt == 0) {
                        sb.append(1 + " " + 0);
                    } else {
                        for (int i = 0; i < n; i++) {
                            if (arr[i] < 0) {
                                sb.append(i + 1 + " " + 0);
                                break;
                            }
                        }
                    }
                }
            } else {
                sb.append(0);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
