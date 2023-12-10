package 백준.실버.실버2.Ex1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        long max = Long.MIN_VALUE;

        for(int i = 0; i<k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(arr[i], max);
        }

        max++;

        long min = 0;
        long mid = 0;

        while(max > min) {
            mid = (min + max)/2;

            long count = 0;

            for(int i = 0; i<k; i++) {
                count += arr[i] / mid;
            }

            if(count < n) {
                max = mid;
            } else {
                min = mid+1;
            }
        }

        System.out.println(min-1);
    }
}
