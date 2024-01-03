package 백준.실버.실버2.Ex4963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int w, h;

    public static boolean[][] visited;
    public static int[][] board;

    public static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static int[] dy = {1, 1, 1, 0, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st= new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(w == 0 && h == 0) {
                break;
            }

            visited = new boolean[h][w];
            board = new int[h][w];

            for(int i= 0; i<h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j<w; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;
            for(int i = 0; i<h; i++) {
                for(int j = 0; j<w; j++) {
                    if(!visited[i][j] && board[i][j] == 1) {
                        cnt++;
                        dfs(j, i);
                    }
                }
            }
            sb.append(cnt).append('\n');
        }

        System.out.println(sb);

    }


    public static void dfs(int startX, int startY) {
        if(visited[startY][startX]) {
            return;
        }

        visited[startY][startX] = true;

        for(int i = 0; i<8; i++) {
            int nx = startX + dx[i];
            int ny = startY + dy[i];

            if(nx < 0 || ny < 0 || nx>=w || ny >= h) continue;

            if(!visited[ny][nx] && board[ny][nx] ==1) {
                dfs(nx, ny);
            }
        }
    }
}
