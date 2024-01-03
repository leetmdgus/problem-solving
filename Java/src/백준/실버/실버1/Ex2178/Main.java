package 백준.실버.실버1.Ex2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;
    public static boolean[][] visited;
    public static int[][] board;

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n][m];
        board = new int[n][m];

        for(int i = 0; i<n ;i++) {
            String[] arr = br.readLine().split("");
            for(int j = 0; j<m; j++) {
                board[i][j] = Integer.parseInt(arr[j]);
            }
        }

        bfs(0, 0);

        System.out.println(board[n-1][m-1]);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x,y});
        visited[y][x] = true;

        while(!q.isEmpty()) {
            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i=0; i<4; i++) {
                int nx = nowX + dx[i];
                int ny = nowY + dy[i];

                if (nx < 0 || ny < 0 || nx >= m || ny >= n)
                    continue;
                if (visited[ny][nx] || board[ny][nx] == 0)
                    continue;

                visited[ny][nx] = true;
                q.add(new int[] {nx, ny});
                board[ny][nx] = board[nowY][nowX]+1;
            }
        }
    }
}
