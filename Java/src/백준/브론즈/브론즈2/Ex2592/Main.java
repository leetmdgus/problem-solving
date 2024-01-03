package 백준.브론즈.브론즈2.Ex2592;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int aver = 0;
        int[] arr = new int[1000];

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n]++;
            aver += n;
        }

        System.out.println(aver / 10);

        int[] most = new int[2];
        for (int i = 0; i < 1000; i++) {
            if (most[1] <= arr[i]) {
                most[0] = i;
                most[1] = arr[i];
            }
        }

        System.out.println(most[0]);
    }
}
