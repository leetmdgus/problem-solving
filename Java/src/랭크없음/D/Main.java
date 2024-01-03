package 랭크없음.D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            long m = Long.parseLong(br.readLine());

            for (int i = 0; i <= m; i++) {
                if(Math.pow(2, i) > m) break;

                for (int j = i; Math.pow(2, i) + Math.pow(2, j) <= m; j++) {
                    if (Math.pow(2, i) + Math.pow(2, j) == m) {
                        sb.append(i + " " + j).append('\n');
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
