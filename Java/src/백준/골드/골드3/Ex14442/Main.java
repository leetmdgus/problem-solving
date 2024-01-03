package 백준.골드.골드3.Ex14442;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, K;
    static int[][] arr;
    static boolean[][][] visited;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M][K+1];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        bfs();

        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }

    public static void bfs() {
        Queue<Loc> q = new LinkedList<>();
        q.add(new Loc(0, 0, 1, 0));
        visited[0][0][0] = true;

        while (!q.isEmpty()) {
            Loc now = q.poll();

            if (now.y == N - 1 && now.x == M - 1) {
                ans = Math.min(now.cost, ans);
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + now.x;
                int ny = dy[i] + now.y;

                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;

                if (arr[ny][nx] == 0) {
                    if (!visited[ny][nx][now.breakCnt]) {
                        visited[ny][nx][now.breakCnt] = true;
                        q.add(new Loc(nx, ny, now.cost + 1, now.breakCnt));
                    }
                } else if (now.breakCnt < K && !visited[ny][nx][now.breakCnt+1]) {
                    visited[ny][nx][now.breakCnt+1] = true;
                    q.add(new Loc(nx, ny, now.cost + 1, now.breakCnt+1));
                }
            }
        }
    }

    static class Loc {
        int x, y, cost, breakCnt;

        public Loc(int x, int y, int cost, int breakCnt) {
            this.x = x;
            this.y = y;
            this.cost = cost;
            this.breakCnt = breakCnt;
        }
    }
}