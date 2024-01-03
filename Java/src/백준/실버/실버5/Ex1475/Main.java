package 백준.실버.실버5.Ex1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            arr[n]++;
        }


        int max = (arr[6] + arr[9]) % 2 == 0 ? (arr[6] + arr[9]) / 2 : (arr[6] + arr[9]) / 2 + 1;
        for (int i = 0; i <= 9; i++) {
            if (i == 6 || i == 9) continue;

            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}
