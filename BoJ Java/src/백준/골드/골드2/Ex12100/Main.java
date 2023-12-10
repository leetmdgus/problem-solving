package 백준.골드.골드2.Ex12100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] board;
    public static int max = Integer.MIN_VALUE;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        game_2048(new int[5], 0);

        System.out.println(max);

    }

    public static void game_2048(int[] order, int depth) { // 0 : up 1: down 2: right 3: left
        if (depth == 5) {
            move(order);
            return;
        }

        for (int i = 0; i < 4; i++) {
            order[depth] = i;
            game_2048(order, depth + 1);
        }

    }

    public static void move(int[] order) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < 5; i++) {
            switch (order[i]) {
                case 0:
                    arr = up(arr);
                    break;
                case 1:
                    arr = down(arr);
                    break;
                case 2:
                    arr = right(arr);
                    break;
                case 3:
                    arr = left(arr);
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
    }

    public static int[][] up(int[][] arr) {
        for (int j = 0; j < n; j++) {
            int index = 0;
            int block = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] != 0) {
                    if (block == arr[i][j]) {
                        arr[index - 1][j] <<= 1;
                        block = 0;
                        arr[i][j] = 0;
                    } else {
                        block = arr[i][j];
                        arr[i][j] = 0;
                        arr[index][j] = block;
                        index++;
                    }
                }
            }
        }
        return arr;
    }

    public static int[][] down(int[][] arr) {
        for(int j = 0; j<n ;j++) {
            int index = n-1;
            int block = 0;
            for(int i = n-1; i>=0; i--) {
                if(arr[i][j]!= 0) {
                    if(block == arr[i][j]) {
                        arr[index+1][j] <<=1;
                        block = 0;
                        arr[i][j] = 0;
                    } else {
                        block = arr[i][j];
                        arr[i][j] = 0;
                        arr[index][j] = block;
                        index--;
                    }
                }
            }

        }

        return arr;
    }

    public static int[][] right(int[][] arr) {
        for(int i = 0; i<n; i++) {
            int index = n-1;
            int block = 0;

            for(int j = n-1; j>=0; j--) {
                if(arr[i][j] != 0) {
                    if(arr[i][j] == block) {
                        arr[i][index+1] <<= 1;
                        block = 0;
                        arr[i][j] = 0;
                    } else{
                        block = arr[i][j];
                        arr[i][j] = 0;
                        arr[i][index] = block;
                        index--;
                    }
                }
            }
        }
        return arr;
    }

    public static int[][] left(int[][] arr) {
        for(int i = 0; i<n; i++) {
            int index = 0;
            int block = 0;

            for(int j = 0; j<n ;j++) {
                if(arr[i][j] != 0) {
                    if(block == arr[i][j]) {
                        arr[i][index-1] <<=1;
                        block = 0;
                        arr[i][j] = 0;
                    } else {
                        block = arr[i][j];
                        arr[i][j] = 0;
                        arr[i][index] = block;
                        index++;
                    }
                }
            }
        }
        return arr;
    }
}
