package 백준.실버.실버1.Ex1074;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N, r, c;
    public static int order;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        int row = (int)Math.pow(2, N);

        search(0, 0, row);
        System.out.println(order);
    }

    public static void search(int row, int col, int size) {
        if(size == 1) {
            return;
        }

        int newSize = size/2;
        if(r < row + newSize && c < col + newSize) {
           search(row, col, newSize);
        } else if( r < row + newSize && c >= col + newSize) {
            order += (size * size) / 4;
            search(row, col+ newSize, newSize);
        } else if(r >= row+newSize && c < col+newSize) {
            order += ((size * size) / 4) * 2;
            search(row+ newSize, col, newSize);
        } else {
            order += ((size * size) / 4) * 3;
            search(row+newSize, col+newSize, newSize);
        }

    }
}
