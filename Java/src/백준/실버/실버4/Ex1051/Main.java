package 백준.실버.실버4.Ex1051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                arr[i][j] = str.charAt(j - 1) - '0';
            }
        }


        int a = Math.min(N, M);
        while (a-- > 0) {
            for (int i = 1; i <= N - a; i++) {
                for (int j = 1; j <= M - a; j++) {
                    int left_up = arr[i][j];
                    int left_down = arr[i][j + a];
                    int right_up = arr[i + a][j];
                    int right_down = arr[i + a][j + a];

                    if (left_up == left_down && right_up == right_down && left_up == right_up) {
                        System.out.println((a+1) * (a+1));
                        return;
                    }
                }
            }
        }

        System.out.println(a * a);
    }
}
