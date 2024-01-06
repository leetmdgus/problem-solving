package 코드포스.Hello_2024.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);
                if (c == '+') {
                    sum++;
                } else {
                    sum--;
                }
            }
            sb.append(sum < 0 ? sum * -1 : sum).append('\n');
        }
        System.out.println(sb);
    }
}
