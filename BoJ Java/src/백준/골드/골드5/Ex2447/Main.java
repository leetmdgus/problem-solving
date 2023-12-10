package 백준.골드.골드5.Ex2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb= new StringBuilder();
    public static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr= new char[n][n];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n ;j++) {
                arr[i][j] = '*';
            }
        }

        makeStar(0, 0, n, false);

        StringBuilder sb= new StringBuilder();
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n ;j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static void makeStar(int row, int col, int size, boolean blank) {
        if(blank) {
            for(int i = row; i<row + size; i++) {
                for(int j = col; j<col+size; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        if(size == 1) {
            return;
        }

        int newSize = size/3;
        makeStar(row, col, newSize, false);    // 1
        makeStar(row, col+newSize, newSize, false);    // 2
        makeStar(row, col+newSize+newSize, newSize, false);    // 3
        makeStar(row+newSize, col, newSize, false);    // 4
        makeStar(row+newSize, col+newSize, newSize, true);    // 5
        makeStar(row+newSize, col+newSize+newSize, newSize, false);    // 6
        makeStar(row+newSize+newSize, col, newSize, false);    // 7
        makeStar(row+newSize+newSize, col+newSize, newSize, false);    // 8
        makeStar(row+newSize+newSize, col+newSize+newSize, newSize, false);    // 9
    }

}
