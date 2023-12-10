package 백준.플래티넘.플래티넘5.Ex2104;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        long[] arr = new long[n];

        arr[0] = Integer.parseInt(st.nextToken());
        for(int i = 1; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] minArr = new int[n];
        for(int i = 0; i<n; i++) {

        }

        long score = 0;
        for(int i = 0; i<2 * n ;i++) {
            score = Math.max(arr[i] * minArr[i], score);
        }

        System.out.println(score);
    }
}
