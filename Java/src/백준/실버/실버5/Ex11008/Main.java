package 백준.실버.실버5.Ex11008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String p = st.nextToken();

            String str = s.replaceAll(p, ",");
            int cnt = str.length();

            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}
