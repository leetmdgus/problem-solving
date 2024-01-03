package 백준.브론즈.브론즈2.Ex2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = 5;
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i<n ;i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
        }

        Arrays.sort(arr);

        System.out.println(sum / n);
        System.out.println(arr[arr.length/2]);
    }
}
