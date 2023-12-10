package 백준.브론즈.브론즈1.Ex1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    if (++count == n) {
                        System.out.println((i-j) + "/" + (j+1));
                        return;
                    }
                }
            } else {
                for (int j = i; j >= 1; j--) {
                    if (++count == n) {
                        System.out.println((i-j+1) + "/" + (j));
                        return;
                    }
                }
            }
        }
    }
}
