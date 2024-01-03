package 백준.골드.골드5.Ex18405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] arr;

    static Queue<int[]> q = new LinkedList<>();

    static int S, X, Y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] != 0) {
                    q.add(new int[]{j, i, 0});
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        bfs();

        System.out.println(arr[X - 1][Y - 1]);
    }

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void bfs() {
        boolean[][] visited;
        while (!q.isEmpty()) {
            visited = new boolean[N][N];

            int len = q.size();
            for (int j = 0; j < len; j++) {
                int[] now = q.poll();
                int x = now[0];
                int y = now[1];
                int t = now[2];

                if (now[2] == S) {
                    continue;
                }

                for (int i = 0; i < 4; i++) {
                    int nx = dx[i] + x;
                    int ny = dy[i] + y;

                    if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;

                    if (arr[ny][nx] == 0) {
                        arr[ny][nx] = arr[y][x];
                        visited[ny][nx] = true;
                        q.add(new int[]{nx, ny, t + 1});

                    } else if (visited[ny][nx] && arr[ny][nx] > arr[y][x]) {
                        arr[ny][nx] = arr[y][x];
                    }
                }
            }
        }
    }
}
