package 백준.실버.실버1.Ex16466;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] sold = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int idx = Integer.parseInt(st.nextToken()) - 1;
            if (idx < n) {
                sold[idx] = true;
            }
        }

        int ticket = 1;
        for (int i = 0; i < n; i++) {
            if (!sold[i]) {
                break;
            }
            ticket++;
        }
        System.out.println(ticket);
    }
}
