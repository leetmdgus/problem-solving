/* 1003번 피보나치 함수
    알고리즘 분류: 다이나믹 프로그래밍
    https://www.acmicpc.net/problem/1003
*/

package 실버3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class Ex1003 {
    private static void countZeroAndOnePrints(int n) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        sb.append(fibonacci1(n));

    }

    private static void fibonacci2(int n) {
        int[] fiboList = new int[40];
        fiboList[0] = 0;
        fiboList[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            fiboList[i] = fiboList[i - 1] + fiboList[i - 2];
        }
        System.out.println(fiboList[n]);
    }

    private static int fibonacci1(int n) {
        if (n == 0) {
            System.out.print("0 ");
            return 0;
        } else if (n == 1) {
            System.out.print(("1 "));
            return 1;
        } else {
            return fibonacci1(n - 1) + fibonacci1(n - 2);
        }
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int repeat = Integer.parseInt(br.readLine());
//        while(repeat > 0) {
//            repeat--;
//            countZeroAndOnePrints(3);
//        }
        fibonacci1(3);
        System.out.println();
        fibonacci2(3);

    }
}
