package 백준.브론즈.브론즈2.Ex26264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int bCnt = 0, sCnt = 0;

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's') {
                sCnt++;
            }
        }

        bCnt = n - sCnt;

        if (bCnt >= sCnt) {
            System.out.print("bigdata? ");
        }
        if (sCnt >= bCnt) {
            System.out.print("security! ");
        }
    }
}
