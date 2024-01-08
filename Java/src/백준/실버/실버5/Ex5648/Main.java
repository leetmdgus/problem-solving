package 백준.실버.실버5.Ex5648;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];
        for(int i = 0; i<n; i++) {
            arr[i] = Long.parseLong(new StringBuilder(sc.next()).reverse().toString());
        }

        Arrays.sort(arr);

        StringBuilder sb= new StringBuilder();
        for(int i = 0 ;i<n; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
