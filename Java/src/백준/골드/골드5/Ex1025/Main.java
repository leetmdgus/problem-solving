package 백준.골드.골드5.Ex1025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        long makeNum = -1;

        for (int i = 0; i < n; i++) { // 행 시작점 설정
            for (int j = 0; j < m; j++) { // 열 시작점 설정

                for (int d1 = -n; d1 < n; d1++) { // 행공차
                    for (int d2 = -m; d2 < m; d2++) { // 열 공차

                        if (d1 == 0 && d2 == 0) continue;

                        int y = i;
                        int x = j;

                        int sqr = 0;
                        while (y < n && x < m && y >= 0 && x >= 0) {
                            sqr *= 10;
                            sqr += arr[y][x];

                            if (isSquare(sqr)) {
                                makeNum = Math.max(makeNum, sqr);
                            }

                            y += d1;
                            x += d2;
                        }
                    }
                }
            }
        }
        System.out.println(makeNum);
    }

    public static boolean isSquare(int n) {
        int root = (int) Math.sqrt(n);
        return Math.pow(root, 2) == n;
    }
}
