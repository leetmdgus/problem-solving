package 백준.실버.실버5.Ex1652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = 0;
        int col = 0;

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i].charAt(j) == '.') {
                    cnt++;
                } else {
                    if (cnt >= 2) {
                        row++;
                    }
                    cnt = 0;
                }
            }
            if (cnt >= 2) {
                row++;
            }
        }

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j].charAt(i) == '.') {
                    cnt++;
                } else {
                    if (cnt >= 2) {
                        col++;
                    }
                    cnt = 0;
                }
            }
            if (cnt >= 2) {
                col++;
            }
        }

        System.out.println(row + " " + col);

    }
}
