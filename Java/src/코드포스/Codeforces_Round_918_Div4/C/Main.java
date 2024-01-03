package 코드포스.Codeforces_Round_918_Div4.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long sum = 0;
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int i = 0; i<n; i++) {
                sum += Long.parseLong(st.nextToken());
            }
            if((long)Math.sqrt(sum) * (long)Math.sqrt(sum) == sum) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }
}

