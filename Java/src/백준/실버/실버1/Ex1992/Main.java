package 백준.실버.실버1.Ex1992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int N;
    public static int[][] arr;

    public static StringBuilder sb= new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for(int i = 0; i<N; i++) {
            String[] strArr = br.readLine().split("");
            for(int j = 0; j<N; j++) {
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        partition(0, 0, N);
        System.out.println(sb);
    }

    public static void partition(int row, int col, int size) {
        if(numCheck(row, col, size)) {
            sb.append(arr[row][col]);
            return;
        }

        int newSize= size/2;
        sb.append('(');
        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row+newSize, col, newSize);
        partition(row+newSize, col+newSize, newSize);
        sb.append(')');
    }

    public static boolean numCheck(int row, int col, int size) {
        int num = arr[row][col];
        for(int i = row; i<row+size; i++) {
            for(int j = col; j<col+size; j++) {
                if(num != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}