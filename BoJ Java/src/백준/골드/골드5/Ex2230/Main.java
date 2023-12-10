package 백준.골드.골드5.Ex2230;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        int[] arr = new int[n];
        for(int i = 0; i<n ;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int p1 = 0;
        int p2 = 1;

        int ans = Integer.MAX_VALUE;
        while(p1 <= p2 && p2 < arr.length) {
            int diff = arr[p2] - arr[p1];

            if(diff < m) {
                p2++;
            } else if(diff >= m) {
                p1++;
            }

            if(diff >= m && ans > diff) {
                ans = diff;
            }
        }

        System.out.println(ans);
    }
}
