package 백준.실버.실버2.Ex24480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static PriorityQueue<Integer>[] nodes;
    public static int N, M, R;

    public static int order;
    public static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        nodes = new PriorityQueue[N + 1];
        visited = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            nodes[i] = new PriorityQueue<>(Comparator.reverseOrder());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            nodes[u].add(v);
            nodes[v].add(u);
        }

        order = 1;
        visited[R] = order;
        dfs(R);

        StringBuilder sb =new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(visited[i] + "\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int start) {
        while(!nodes[start].isEmpty()) {
            int next = nodes[start].poll();

            if(visited[next] == 0) {
                visited[next] = ++order;

                dfs(next);
            }
        }
    }
}
