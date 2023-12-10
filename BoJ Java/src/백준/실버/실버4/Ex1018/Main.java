package 백준.실버.실버4.Ex1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int M, N;
    public static String[][] board;
    public static int[][] wBoard, bBoard;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        initBoard();
        chess();
        System.out.println(min);
    }

    public static void initBoard() throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new String[N][M];
        wBoard = new int[N][M];
        bBoard = new int[N][M];

        for(int i = 0; i< N; i++) {
            board[i] = br.readLine().split("");
            for(int j = 0; j<M; j++) {
                if(i%2 == 0 && j%2== 0) {
                    wBoard[i][j] = 0;
                    bBoard[i][j] = 1;
                } else if(i%2 == 0) {
                    wBoard[i][j] = 1;
                    bBoard[i][j] = 0;
                }  else if(j%2 == 0) {
                    wBoard[i][j] = 1;
                    bBoard[i][j] = 0;
                }  else {
                    wBoard[i][j] = 0;
                    bBoard[i][j] = 1;
                }
            }
        }
    }

    public static void chess() {
        for(int i = 0; i<=N-8; i++) {
            for(int j = 0; j<=M-8; j++) {
                min = Math.min(paint(i, j), min);
            }
        }
    }

    public static int paint(int y, int x) {
        int bCount = 0;
        int wCount = 0;

        for(int i = y; i<y+8; i++) {
            for(int j = x; j<x+8; j++) {
                int color = board[i][j].equals("W") ? 0 : 1;
                if(color == bBoard[i][j]) {
                    wCount++;
                } else {
                    bCount++;
                }
            }
        }
        return Math.min(wCount, bCount);
    }
}
