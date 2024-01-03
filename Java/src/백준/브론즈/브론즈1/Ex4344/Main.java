package 백준.브론즈.브론즈1.Ex4344;

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
            int c = Integer.parseInt(st.nextToken());

            int[] arr = new int[c];
            int sum = 0;
            for (int i = 0; i < c; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            int aver = sum / c;

            int cnt = 0;
            for (int i = 0; i < c; i++) {
                if (arr[i] > aver) {
                    cnt++;
                }
            }

            double ans = ((double) cnt / c) * 100;

            String str = String.format("%.3f", ans);
            sb.append(str).append('%').append('\n');
        }
        System.out.println(sb);
    }
}
