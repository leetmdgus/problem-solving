package 코드포스.Codeforces_Round_898_Div4.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }


            long ans = 0;
            for (int i = 0; i < n; i++) {
                long multi = 1;
                for (int j = 0; j < n; j++) {
                    if(j == i) {
                        multi *= (arr[i]+1);
                    } else {
                        multi *= arr[j];
                    }
                }
                ans = Math.max(ans, multi);
            }
            sb.append(ans).append('\n');
        }

        System.out.println(sb);
    }
}
