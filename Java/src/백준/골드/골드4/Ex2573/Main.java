package 백준.골드.골드4.Ex2573;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] map;
    static Queue<int[]> waterQ = new LinkedList<>();

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 덩이로 분리되어있는지 확인 -> bfs
        // melting
        // -> waterQ에 담는다.
        // -> 닿아있는 부분을 --한다.
        // -> 만약 0이라면 waterQ에 넣는다.
        // -> 만약 4면중 한 면이 0이 아니라면 기존 물을 waterQ에 넣는다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 0) {
                    waterQ.add(new int[]{j, i});
                }
            }
        }

        // 이부분 체크
        if (waterQ.size() == 0) {
            System.out.println(0);
            return;
        }

        time = 0;
        while (true) {
            visited = new boolean[N][M];
            if (isDivided()) break;
            melting();
            time++;
        }

        System.out.println(time);
    }


    static boolean[][] visited;
    static int time;

    public static boolean isDivided() {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && map[i][j] > 0) {
                    visited[i][j] = true;
                    bfs(j, i);
                    cnt++;
                }
            }
        }

        // 이부분 체크
        if (cnt == 0) {
            time = 0;
        }
        return !(cnt == 1);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] now = q.remove();

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if (map[ny][nx] == 0 || visited[ny][nx]) continue;

                visited[ny][nx] = true;
                q.add(new int[]{nx, ny});
            }
        }
    }

    public static void melting() {
        int size = waterQ.size();

        for (int i = 0; i < size; i++) {
            int[] now = waterQ.remove();

            boolean flag = false;
            for (int j = 0; j < 4; j++) {
                int nx = now[0] + dx[j];
                int ny = now[1] + dy[j];

                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if (map[ny][nx] == 0) continue;

                map[ny][nx]--;

                if (map[ny][nx] == 0) {
                    waterQ.add(new int[]{nx, ny});
                } else {
                    flag = true;
                }
            }

            if (flag) {
                waterQ.add(now);
            }
        }
    }
}
