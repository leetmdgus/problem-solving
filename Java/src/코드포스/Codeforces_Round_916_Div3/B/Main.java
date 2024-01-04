package 코드포스.Codeforces_Round_916_Div3.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken())+1;

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = n - i;
            }
            arr = reverse(arr, 0, k);

            for (int a : arr) {
                sb.append(a + " ");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    static int[] reverse(int[] arr, int start, int end) {
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            res[end - i - 1] = arr[start + i];
        }

        return res;
    }
}
