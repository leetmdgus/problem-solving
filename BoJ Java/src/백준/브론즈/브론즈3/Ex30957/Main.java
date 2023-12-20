package 백준.브론즈.브론즈3.Ex30957;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int bCnt = 0, sCnt = 0, aCnt = 0;
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == 'B') {
                bCnt++;
            } else if (c == 'S') {
                sCnt++;
            } else if (c == 'A') {
                aCnt++;
            }
        }

        if (bCnt == sCnt && sCnt == aCnt) {
            System.out.println("SCU");
            return;
        }

        if (bCnt >= sCnt && bCnt >= aCnt) {
            System.out.print("B");
        }
        if (sCnt >= bCnt && sCnt >= aCnt) {
            System.out.print("S");
        }
        if (aCnt >= bCnt && aCnt >= sCnt) {
            System.out.print("A");
        }
    }
}
