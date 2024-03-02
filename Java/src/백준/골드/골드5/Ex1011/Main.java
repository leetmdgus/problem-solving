package 백준.골드.골드5.Ex1011;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int diff = y - x;

            int num = 0;
            int current = 1;
            for (int i = 1; i <= diff;) {
                if(current == Math.sqrt(i))
                num++;
            }
        }

        // int n == sqrt(a) 라고 할 때
        // a 이하인 수 n개, a초과인수 n개가 존재한다 .

        // 1               1 (1)
        // 1 > 1           2 (2)

        // 1 > 1 > 1       3 (3)
        // 1 > 2 > 1       4 (3)
        // 1 > 2 > 1 > 1           5 (4)
        // 1 > 2 > 2 > 1           6 (4)

        // 1 > 2 > 2 > 1 > 1;      7 (5)
        // 1 > 2 > 2 > 2 > 1;      8 (5)
        // 1 > 2 > 3 > 2 > 1;      9 (5)
        // 1 > 2 > 3 > 2 > 1 > 1;         10
        // 1 > 2 > 3 > 2 > 2 > 1;         11
        // 1 > 2 > 3 > 3 > 2 > 1;         12

        // 1 > 2 > 3 > 3 > 2 > 1 > 1;     13
        // 1 > 2 > 3 > 3 > 2 > 2 > 1;     14
        // 1 > 2 > 3 > 3 > 3 > 2 > 1;     15
        // 1 > 2 > 3 > 4 > 3 > 2 > 1;     16
        // 1 > 2 > 3 > 4 > 3 > 2 > 1 > 1   17
        // 1 > 2 > 3 > 4 > 3 > 2 > 2 > 1   18
        // 1 > 2 > 3 > 4 > 3 > 3 > 2 > 1   19
        // 1 > 2 > 3 > 4 > 4 > 3 > 2 > 1   20

        // 1 > 2 > 3 > 4 > 4 > 3 > 2 > 1 > 1 21
        // 1 > 2 > 3 > 4 > 4 > 3 > 2 > 2 > 1 22
        // 1 > 2 > 3 > 4 > 4 > 3 > 3 > 2 > 1 23
        // 1 > 2 > 3 > 4 > 4 > 4 > 3 > 2 > 1 24
        // 1 > 2 > 3 > 4 > 5 > 4 > 3 > 2 > 1 25


        System.out.println(sb);
    }

}
