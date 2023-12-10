package 백준.브론즈.브론즈2.Ex5218;

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
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            int length = str1.length();

            sb.append("Distances: ");
            for (int i = 0; i < length; i++) {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(i);

                if (c1 <= c2) {
                    sb.append(c2 - c1).append(' ');
                } else {
                    sb.append(c2 + 26 - c1).append(' ');
                }
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
