package 코드포스.Codeforces_Round_923_Div3.B;

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
            int[] alphabet = new int['z' - 'a' + 1];

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }


            for (int i = 0; i < n; i++) {
                int num = arr[i];

                for (int j = 0; j < 'z' - 'a' + 1; j++) {
                    if (alphabet[j] == num) {
                        sb.append((char)(j + 'a'));
                        alphabet[j]++;
                        break;
                    }
                }
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
