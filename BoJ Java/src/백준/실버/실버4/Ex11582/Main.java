package 백준.실버.실버4.Ex11582;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static int n, k;
    public static boolean isDivide;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        k = Integer.parseInt(br.readLine());

        sort(0, 0);
    }

    public static void sort(int start, int end) {
        if(k == 0) {
            return;
        }

        int mid = (start+end)/2;
        if(isDivide) {

        }



    }

}
