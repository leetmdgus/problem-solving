package 백준.실버.실버5.Ex2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[][] arr = new boolean[100][100];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            for (int j = s; j < s + 10; j++) {
                for (int k = e; k < e + 10; k++) {
                    if(!arr[j][k]) {
                      arr[j][k] = true;
                      cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
