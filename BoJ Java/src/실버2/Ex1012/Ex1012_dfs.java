package 실버2.Ex1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1012_dfs {

    static int M, N, K;
    static int[][] farm;
    static boolean[][] visit;
    static int count;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};


    static void dfs(int x, int y) {
        visit[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int p1 = x + dx[i];
            int p2 = y + dy[i];

            if (p1 < M && p1 >= 0 && p2 < N && p2 >= 0) {
                if (farm[p2][p1] == 1 && !visit[p2][p1]) {
                    dfs(p1, p2);
                }
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCaseNum = Integer.parseInt(st.nextToken());

        while (testCaseNum-- > 0) {
            count = 0;
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            farm = new int[N][M];
            visit = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                farm[y][x] = 1;
            }

            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (farm[y][x] == 1 && !visit[y][x]) {
                        dfs(x, y);
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}