package 백준.실버.실버5.Ex28282;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] left = new int[k + 1];
        int[] right = new int[k + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < x; i++) {
            int idx = Integer.parseInt(st.nextToken());
            left[idx]++;
        }

        for (int i = 0; i < x; i++) {
            int idx = Integer.parseInt(st.nextToken());
            right[idx]++;
        }

        long ans = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                if (i == j) continue;

                ans += left[i] * right[j];
            }
        }

        System.out.println(ans);
    }
}
