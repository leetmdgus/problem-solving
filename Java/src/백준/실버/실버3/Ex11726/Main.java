package 백준.실버.실버3.Ex11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n < 3) {
            System.out.println(n);
            return;
        }

        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;

        for(int i = 3; i< arr.length; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;
        }

        System.out.println(arr[n]);
    }
}
