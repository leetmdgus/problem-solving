package 백준.골드.골드5.Ex16928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] event = new int[101];
    static boolean[] visited = new boolean[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            event[x] = y;
        }

        System.out.println(bfs());
    }

    public static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 0});

        while (!q.isEmpty()) {
            int[] now = q.poll();

            if (now[0] == 100) {
                return now[1];
            }

            for (int i = 1; i <= 6; i++) {
                int next = now[0] + i;
                if (next > 100 || visited[next]) continue;

                visited[next] = true;
                visited[event[next]] = true;

                if (event[next] != 0) {
                    q.add(new int[]{event[next], now[1] + 1});
                } else {
                    q.add(new int[]{next, now[1] + 1});
                }
            }
        }

        return -1;
    }
}
