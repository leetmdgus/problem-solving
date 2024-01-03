package 코드포스.Codeforces_ROund_916_Div3.A;

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
            int[] arr = new int[26];

            String str = br.readLine();
            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);
                arr[c - 'A']++;
            }

            int num = 0;
            for (int i = 0; i < 26; i++) {
                if(arr[i] >= i+1) {
                    num++;
                }
            }

            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }
}
