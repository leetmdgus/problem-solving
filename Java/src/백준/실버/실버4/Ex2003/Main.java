package 백준.실버.실버4.Ex2003;

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

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i  = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0;
        int j = 0;

        int sum = 0;
        int count = 0;
        while(j < n && i<n) {
            if(sum < m) {
                sum+= arr[j++];
            } else {
                sum -= arr[i++];
            }
            if(sum == m) {
                count++;
            }
        }

        while(i<n) {
            sum -= arr[i++];
            if(sum == m) {
                count++;
            }
        }

        System.out.println(count);
    }
}
