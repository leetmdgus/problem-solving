package 백준.골드.골드5.Ex10026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static String[][] board;
    public static boolean[][] check;


    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        board = new String[n][n];
        check = new boolean[n][n];
        
        for(int i =0 ;i <n; i++) {
            board[i] = br.readLine().split("");
        }

        int colorCnt = 0;
        int notColorCnt = 0;

        for(int i = 0; i<n; i++) {
            for(int j =0; j<n; j++) {
                if(!check[i][j]) {
                    colorDfs(j, i);
                    colorCnt++;
                }
            }
        }

        for(int i = 0; i<n ;i++) {
            for(int j = 0; j<n ;j++) {
                if(board[i][j].equals("G")) {
                    board[i][j] = "R";
                }
            }
        }

        check = new boolean[n][n];
        for(int i = 0; i<n; i++) {
            for(int j =0; j<n; j++) {
                if(!check[i][j]) {
                    colorDfs(j, i);
                    notColorCnt++;
                }
            }
        }

        System.out.println(colorCnt + " " + notColorCnt);

    }

    public static void colorDfs(int x, int y) {
        check[y][x] = true;
        String current = board[y][x];
        
        for(int i = 0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

            if(!check[ny][nx] && board[ny][nx].equals(current)) {
                colorDfs(nx, ny);
            }
        }
    }
}
