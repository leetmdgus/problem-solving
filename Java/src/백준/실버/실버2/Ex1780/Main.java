package 백준.실버.실버2.Ex1780;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int minusCount, zeroCount, oneCount;
    public static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        StringTokenizer st;
        for(int i = 0; i<n; i++) {
            st= new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, n);

        System.out.println(minusCount);
        System.out.println(zeroCount);
        System.out.println(oneCount);
    }

    public static void partition(int row, int col, int size) {
        if(numCheck(row, col, size)) {
            if(board[row][col] == -1) {
                minusCount++;
            } else if(board[row][col] == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
            return;
        }

        int newSize = size/3;
        partition(row, col, newSize);                                           //1
        partition(row, col+newSize, newSize);                               //2
        partition(row, col+newSize+newSize, newSize);                       //3
        partition(row+newSize, col, newSize);                               //4
        partition(row+newSize, col+newSize, newSize);                   //5
        partition(row+newSize, col+newSize+newSize, newSize);           //6
        partition(row+newSize+newSize, col, newSize);                       //7
        partition(row+newSize+newSize, col+newSize, newSize);           //8
        partition(row+newSize+newSize, col+newSize+newSize, newSize);   //9

    }
    public static boolean numCheck(int row, int col, int size) {
        int num = board[row][col];
        for(int i = row; i < row+size; i++) {
            for(int j = col; j < col+size; j++) {
                if(num != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
