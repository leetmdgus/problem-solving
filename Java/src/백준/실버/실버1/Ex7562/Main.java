package 백준.실버.실버1.Ex7562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            boolean[][] visited = new boolean[n][n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            XY start = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            st = new StringTokenizer(br.readLine());
            XY end = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            Queue<XY> q = new LinkedList<>();

            q.add(start);

            while (!q.isEmpty()) {
                XY now = q.remove();

                if (now.x == end.x && now.y == end.y) {
                    sb.append(now.move).append('\n');
                    break;
                }

                for (int i = 0; i < 8; i++) {
                    int nx = dx[i] + now.x;
                    int ny = dy[i] + now.y;

                    if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                    if (visited[ny][nx]) continue;
                    visited[ny][nx] = true;

                    q.add(new XY(nx, ny, now.move + 1));
                }
            }
        }
        System.out.println(sb);
    }

    static int[] dx = {-1, 1, 2, 2, 1, -1, -2, -2};
    static int[] dy = {2, 2, 1, -1, -2, -2, -1, 1};

    static class XY {
        int x, y, move;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public XY(int x, int y, int move) {
            this(x, y);
            this.move = move;
        }
    }
}
