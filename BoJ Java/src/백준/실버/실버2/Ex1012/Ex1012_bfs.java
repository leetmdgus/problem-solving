package 백준.실버.실버2.Ex1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1012_bfs {

    static int[][] ground;
    static boolean[][] visited;
    static int M, N;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCaseNum = Integer.parseInt(st.nextToken());

        while (testCaseNum-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            ground = new int[N][M];
            visited = new boolean[N][M];

            int K = Integer.parseInt(st.nextToken());
            while (K-- > 0) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                ground[y][x] = 1;
            }

            int count = 0;

            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (ground[y][x] == 1 && !visited[y][x]) {
                        bfs(x, y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{startX, startY});

        visited[startY][startX] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = poll[0] + dx[i];
                int y = poll[1] + dy[i];

                if (x < 0 || x >= M || y < 0 || y >= N) {
                    continue;
                }
                //상하좌우 움직인 좌표에 배추가 있고, 체크하지 않은 좌표이면
                if (ground[y][x] == 1 & !visited[y][x]) {
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }
}