package 백준.실버.실버2.Ex1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1260 {
    static int N, M, V;

    static boolean[] visited;
    static int[][] nodes;

    static Queue<Integer> queue = new LinkedList<>();

    static void dfs(int node) {
        System.out.print(node + 1 + " ");

        visited[node] = true;
        for (int i = 0; i < N; i++) {
            if (nodes[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs() {
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node+1 + " ");
            visited[node] = true;

            for(int i = 0; i<N; i++) {
                if(nodes[node][i] == 1 && !visited[i]) {
                    queue.offer(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        nodes = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken()) - 1;
            int connectedNode = Integer.parseInt(st.nextToken()) - 1;
            nodes[node][connectedNode] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (nodes[i][j] == 1 && !visited[i]) {
                    dfs(i);
                }
            }
        }
        System.out.println();

        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (nodes[i][j] == 1 && !visited[i]) {
                    queue.offer(i);
                }
            }
        }
        bfs();

    }
}
