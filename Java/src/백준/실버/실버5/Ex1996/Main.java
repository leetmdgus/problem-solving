package 백준.실버.실버5.Ex1996;

import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int[][] newArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == '.') {
                    for (int k = 0; k < 8; k++) {
                        int nx = j + dx[k];
                        int ny = i + dy[k];

                        if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

                        if (arr[ny][nx] != '.') {
                            newArr[i][j] += arr[ny][nx] - '0';
                        }
                    }
                } else {
                    newArr[i][j] = -1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(newArr[i][j] == -1) {
                    sb.append("*");
                } else if(newArr[i][j] >= 10) {
                    sb.append("M");
                } else {
                    sb.append(newArr[i][j]);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
    static int[] dy = {1, 1, 1, 0, -1, -1, -1, 0};
}
