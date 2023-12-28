package 코드포스.Codeforces_Round_918_Div4.A;

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
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == b) {
                sb.append(c).append('\n');
            } else if( b== c) {
                sb.append(a).append('\n');
            } else {
                sb.append(b).append('\n');
            }
        }
        System.out.println(sb);
    }
}
