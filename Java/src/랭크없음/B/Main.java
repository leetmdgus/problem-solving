package 랭크없음.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[k + 1];

        int min = Integer.MAX_VALUE;
        int minIdx = 0;

        for (int i = 1; i <= k; i++) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            arr[i] = f - 1 + m - d;

            if(arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }

        }

        System.out.println(minIdx);
    }
}
