package 백준.실버.실버2.Ex21736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static char[][] colleague;
    static boolean[][] visited;
    static int N, M;
    static int cx, cy;

    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        colleague = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                colleague[i][j] = str.charAt(j);
                if (colleague[i][j] == 'I') {
                    cx = j;
                    cy = i;
                    colleague[i][j] = 'O';
                }
            }
        }

        bfs();
        System.out.println(cnt == 0 ? "TT" : cnt);
    }

    public static void bfs() {
        Queue<XY> q = new LinkedList<>();
        q.add(new XY(cx, cy));
        visited[cy][cx] = true;

        while (!q.isEmpty()) {
            XY now = q.poll();

            if (colleague[now.y][now.x] == 'P') cnt++;

            for (int i = 0; i < 4; i++) {
                int nextX = dx[i] + now.x;
                int nextY = dy[i] + now.y;

                if (nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) continue;
                if (visited[nextY][nextX] || colleague[nextY][nextX] == 'X') continue;
                visited[nextY][nextX] = true;

                q.add(new XY(nextX, nextY));
            }
        }
    }

    static class XY{
        int x, y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
