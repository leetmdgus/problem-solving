package 백준.실버.실버2.Ex2630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int bCount = 0;
    public static int wCount = 0;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for(int i = 0; i<n; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++) {
               arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        paper(0, 0, arr.length);
        System.out.println(wCount);
        System.out.println(bCount);
    }
    public static void paper(int row, int col, int size) {
        if(isFillWhiteOrBlue(row, col, size)) {
            if(arr[row][col] == 0) {
                wCount++;
            } else {
                bCount++;
            }
            return;
        }

        int newSize = size/2;

        paper(row, col, newSize);                          // 1사분면
        paper( row, col+newSize, newSize);             // 2사분면
        paper(row + newSize,col, newSize);              // 3사분면
        paper(row + newSize, col+newSize, newSize); // 4사분면
    }

    public static boolean isFillWhiteOrBlue(int row, int col, int size) {
        int color = arr[row][col];
        for(int i = row; i<row+size; i++) {
            for(int j = col; j<col+size; j++) {
                if(arr[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
