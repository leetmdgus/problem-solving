package 백준.실버.실버3.Ex2853;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long[] arr = new long[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        int p1 = 0;
        int p2 = N - 1;

        int cnt = 0;
        while (p1 < p2) {
            if (arr[p1] + arr[p2] <= K) {
                cnt++; p1++;
            }
            p2--;
        }

        System.out.println(cnt);
    }
}
