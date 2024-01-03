package 백준.브론즈.브론즈2.Ex1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[] arr = new String[8];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 8; i++) {
            arr[i] = br.readLine();
        }

        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0 && arr[i].charAt(j) == 'F') cnt++;
            }
        }

        System.out.println(cnt);
    }
}
