package 백준.브론즈.브론즈2.Ex1977;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[10_001];
        for (int i = 1; i <= 100; i++) {
            int idx = (int) Math.pow(i, 2);
            if (idx > arr.length) break;
            arr[idx] = true;
        }

        int p1 = min;
        int save = 0;
        int sum = 0;

        while (p1 <= max) {
            if(arr[p1]) {
                if(save == 0) save = p1;
                sum += p1;
            }
            p1++;
        }

        if(sum == 0) System.out.println(-1);
        else System.out.println(sum + "\n" + save);
    }
}
