package 백준.브론즈.브론즈2.Ex5576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] wArr = new int[10];
        int[] kArr = new int[10];

        for(int i = 0; i<10; i++) {
            wArr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i<10; i++) {
            kArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(wArr);
        Arrays.sort(kArr);

        int wSum = wArr[7] + wArr[8] + wArr[9];
        int kSum = kArr[7] + kArr[8] + kArr[9];

        System.out.println(wSum + " " + kSum);
    }
}
