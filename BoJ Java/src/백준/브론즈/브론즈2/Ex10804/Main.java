package 백준.브론즈.브론즈2.Ex10804;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[21];
        for (int i = 1; i <= 20; i++) arr[i] = i;

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int idx1 = Integer.parseInt(st.nextToken());
            int idx2 = Integer.parseInt(st.nextToken());

            arr = revers(arr, idx1, idx2);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 20; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);
    }

    public static int[] revers(int[] arr, int idx1, int idx2) {
        while (idx1 < idx2) {
            int tmp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = tmp;
            idx1++;
            idx2--;
        }

        return arr;
    }
}
