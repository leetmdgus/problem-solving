package 백준.플래티넘.플래티넘5.Ex1517;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int swap = bubbleSort(a);
        System.out.println(swap);
    }

    public static int bubbleSort(int[] arr) {
        int swap = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap++;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return swap;
    }
}
