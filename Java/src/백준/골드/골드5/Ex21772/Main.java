package 백준.골드.골드5.Ex21772;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, 1, -1, 0};

    public static boolean[][] sweatPotato;
    public static int[][] board;
    public static int R,C,T;

    public static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        board = new int[R][C]; // 1 potato, 0: no potato, -1 block
        sweatPotato = new boolean[R][C];
        int locX = 0;
        int locY = 0;

        for(int i = 0; i<R; i++) {
            String str = br.readLine();
            for(int j = 0; j<C; j++) {
                char c = str.charAt(j);
                if(c == 'G') {
                    locX = j;
                    locY = i;
                } else if(c == '#') {
                    board[i][j] = -1;
                } else if (c == 'S') {
                    board[i][j] = 1;
                    sweatPotato[i][j] = true;
                }
            }
        }

        dfs(locX, locY, 0, 0);
        System.out.println(max);
    }

    public static void dfs(int x, int y, int time, int potato) {
        if(time == T) {
            max = Math.max(max, potato);
            return;
        }

        for(int i = 0; i<4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx < 0 || ny < 0 || nx >= C || ny >= R) continue;
            if(board[ny][nx] == -1) continue;

            if(sweatPotato[ny][nx]) {
                sweatPotato[ny][nx] = false;
                dfs(nx, ny, time+1, potato+1);
                sweatPotato[ny][nx] = true;
            } else {
                dfs(nx, ny, time+1, potato);
            }
        }
    }
}
