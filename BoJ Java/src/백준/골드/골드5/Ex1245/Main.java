package 백준.골드.골드5.Ex1245;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N, M;
    public static int[][] board;
    public static boolean[][] visited;
    public static boolean pick;

    public static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static int[] dy = {1, 1, 1, 0, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<M; j++) {
                if(!visited[i][j]) {
                    pick = true;
                    dfs(j, i);
                    if(pick) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int x, int y) {
        int height = board[y][x];
        visited[y][x] = true;


        for(int idx = 0; idx < 8; idx++) {
            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if(nx < 0 || ny < 0 || nx >= M || ny >= N) continue;

            if(board[ny][nx] > height) {
                pick = false;
            }
            if(!visited[ny][nx] && board[ny][nx] == height) {
                dfs(nx, ny);
            }
        }
    }
}

