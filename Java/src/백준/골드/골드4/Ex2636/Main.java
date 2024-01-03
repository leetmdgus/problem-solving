package 백준.골드.골드4.Ex2636;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] board;
    static boolean[][] visited;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int cheese;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) cheese++;
            }
        }

        int cheeseCnt = 0;
        int ans = 0;
        while (cheese != 0) {
            ans++;
            cheeseCnt = cheese;
            bfs();
        }

        System.out.println(ans);
        System.out.println(cheeseCnt);
    }

    public static void bfs() {
        Queue<XY> q = new LinkedList<>();
        q.add(new XY(0, 0));

        visited = new boolean[N][M];
        visited[0][0] = true;

        while (!q.isEmpty()) {
            XY now = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if (visited[ny][nx]) continue;

                visited[ny][nx] = true;
                if (board[ny][nx] == 0) {
                    q.add(new XY(nx, ny));
                } else {
                    board[ny][nx] = 0;
                    cheese--;
                }
            }
        }
    }

    static class XY {
        int x, y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

