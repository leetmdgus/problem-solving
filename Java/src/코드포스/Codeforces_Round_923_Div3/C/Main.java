package 코드포스.Codeforces_Round_923_Div3.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] arrA = new int[k + 1];
            int[] arrB = new int[k + 1];
            int aSize = 0;
            int bSize = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num >= 1 && num <= k) {
                    arrA[num]++;
                    if (arrA[num] == 1) {
                        aSize++;
                    }
                }
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                int num = Integer.parseInt(st.nextToken());

                if (num >= 1 && num <= k) {
                    arrB[num]++;
                    if (arrB[num] == 1) {
                        bSize++;
                    }
                }
            }

            if (aSize >= k / 2 && bSize >= k / 2) {
                boolean flag = true;
                for (int i = 1; i <= k; i++) {
                    if (!(arrA[i] > 0 || arrB[i] > 0)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    sb.append("YES\n");
                } else{
                    sb.append("NO\n");
                }
            } else {
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
    }
}
