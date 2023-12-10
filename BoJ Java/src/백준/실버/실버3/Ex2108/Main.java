package 백준.실버.실버3.Ex2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        System.out.println(arithmeticMean(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr));
        System.out.println(range(arr));
    }
    public static long arithmeticMean(int[] arr) {
        double mean = 0;
        for(int i = 0; i<arr.length; i++) {
            mean += arr[i];
        }

        return Math.round(mean/ arr.length);
    }
    public static int median(int[] arr) {
        return arr[arr.length/2];
    }
    public static int mode(int[] arr) {
        int count = 0;
        int max = -1;
        int mod = arr[0];
        boolean check = false;
        for(int i = 1; i < arr.length; i++) {
            count = (arr[i] == arr[i-1]) ? count+1 : 0;

            if(count > max) {
                max = count;
                mod = arr[i-1];
                check = true;
            } else if(count == max && check) {
                mod = arr[i-1];
                check = false;
            }
        }
        return mod;
    }
    public static int range(int[] arr) {
        return arr[arr.length-1] - arr[0];
    }
}
