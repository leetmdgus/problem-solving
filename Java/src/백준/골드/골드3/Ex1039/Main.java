package 백준.골드.골드3.Ex1039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, K;

    static int ans = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs();
        System.out.println(ans);
    }


    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{N, 0});

        boolean[][] visited = new boolean[1_000_001][K + 1];
        visited[N][0] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();

            if (now[1] == K) {
                ans = Math.max(now[0], ans);
                continue;
            }

            int length = String.valueOf(now[0]).length();
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    int next = swap(now[0], i, j);

                    if (next == -1 || visited[next][now[1] + 1]) continue;

                    q.add(new int[]{next, now[1] + 1});
                    visited[next][now[1] + 1] = true;
                }
            }
        }
    }

    public static int swap(int n, int i, int j) {
        char[] numArr = String.valueOf(n).toCharArray();

        if (i == 0 && numArr[j] == '0') return -1;

        char tmp = numArr[i];
        numArr[i] = numArr[j];
        numArr[j] = tmp;

        return Integer.parseInt(new String(numArr));
    }
}
