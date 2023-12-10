package 백준.브론즈.브론즈2.Ex10812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) arr[i] = i;

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            rotation(i, j, k);

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) sb.append(arr[i] + " ");
        sb.append("\n");

        System.out.println(sb);
    }

    public static void rotation(int i, int j, int k) {
        int cnt = j - k + 1;
        while (cnt-- > 0) {
            for (int idx = j; idx > i; idx--) {
                int tmp = arr[idx];
                arr[idx] = arr[idx - 1];
                arr[idx - 1] = tmp;
            }
        }
    }
}
