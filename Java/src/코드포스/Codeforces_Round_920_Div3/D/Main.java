package 코드포스.Codeforces_Round_920_Div3.D;

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
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            long[] arr = new long[n];
            long[] brr = new long[m];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                brr[i] = Long.parseLong(st.nextToken());
            }

            Arrays.sort(arr);
            Arrays.sort(brr);

            int aIdx1 = 0, aIdx2 = n - 1;
            int bIdx1 = 0, bIdx2 = m - 1;

            long d = 0;

            while (aIdx1 <= aIdx2) {
                long case1 = Math.abs(arr[aIdx1] - brr[bIdx2]);
                long case2 = Math.abs(brr[bIdx1] - arr[aIdx2]);

                if (case1 >= case2) {
                    d += case1;
                    aIdx1++;
                    bIdx2--;
                } else {
                    d += case2;
                    aIdx2--;
                    bIdx1++;
                }
            }

            sb.append(d).append('\n');
        }

        System.out.println(sb);
    }
}
