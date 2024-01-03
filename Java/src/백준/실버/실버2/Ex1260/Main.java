package 백준.실버.실버2.Ex1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int N, M, V;
    public static boolean[][] arr;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new boolean[N + 1][N + 1];
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());
            arr[p1][p2] = true;
            arr[p2][p1] = true;
        }

        visited = new boolean[N + 1];
        dfs(V);
        sb.append("\n");

        visited = new boolean[N + 1];
        bfs();
        System.out.println(sb);
    }

    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");

        for (int i = 1; i <= N; i++) {
            if(arr[start][i] && visited[i] == false) {
                dfs(i);
            }
        }
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        visited[V] = true;
        q.add(V);

        while (!q.isEmpty()) {
            int now = q.poll();
            sb.append(now).append(" ");

            for (int i = 1; i <= N; i++) {
                if (arr[now][i] && visited[i] == false) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
