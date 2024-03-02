package 백준.실버.실버4.Ex1940;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i =0 ;i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int p1 = 0;
        int p2 = n-1;

        int cnt = 0;
        while(p1 < p2) {
            if(arr[p1] + arr[p2] == m) {
                p1++;
                p2--;
                cnt++;
            } else if(arr[p1] + arr[p2] > m){
                p2--;
            } else {
                p1++;
            }
        }

        System.out.println(cnt);
    }
}