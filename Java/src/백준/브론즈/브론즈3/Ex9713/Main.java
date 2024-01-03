package 백준.브론즈.브론즈3.Ex9713;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr = new int[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init();

        StringBuilder sb= new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int i = Integer.parseInt(br.readLine());
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }

    public static void init() {
        arr[1] = 1;
        for (int i = 3; i <= 100; i += 2) {
            arr[i] = arr[i-2] + i;
        }
    }
}
