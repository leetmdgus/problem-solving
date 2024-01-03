package 백준.실버.실버2.Ex24444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int N, M, R;
    public static PriorityQueue<Integer>[] nodes;

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
            nodes[i] = new PriorityQueue<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            nodes[u].add(v);
            nodes[v].add(u);
        }

        bfs();

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=N; i++) {
            sb.append(visited[i] + "\n");
        }
        System.out.println(sb);
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(R);
        int order = 1;
        visited[R] = order++;

        while (!q.isEmpty()) {
            int now = q.poll();

            while(!nodes[now].isEmpty()) {
                int next = nodes[now].poll();

                if(visited[next] != 0) continue;
                visited[next] = order++;
                q.add(next);
            }
        }
    }
}
