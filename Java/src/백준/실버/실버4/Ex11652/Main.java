package 백준.실버.실버4.Ex11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        for(int i = 0; i<n ;i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);
        int count = 0;
        int mCount = 0;
        long max = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                count++;
            } else {
                count = 0;
            }

            if(count > mCount) {
                mCount = count;
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
