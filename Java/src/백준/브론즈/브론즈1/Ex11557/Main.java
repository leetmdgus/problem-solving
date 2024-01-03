package 백준.브론즈.브론즈1.Ex11557;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int drink = 0;
            String school = null;
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                int d = Integer.parseInt(st.nextToken());

                if (d > drink) {
                    drink = d;
                    school = s;
                }
            }
            sb.append(school + "\n");
        }

        System.out.println(sb);
    }
}
