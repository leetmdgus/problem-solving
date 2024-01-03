package 백준.골드.골드5.Ex15681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, R, Q;
    static ArrayList<Integer>[] tree;
    static int[] child;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        tree = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        child = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            tree[v].add(u);
            tree[u].add(v);
        }

        dfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int u = Integer.parseInt(br.readLine());
            sb.append(child[u]).append('\n');
        }
        System.out.println(sb);

    }

    public static int dfs(int parent) {
        int childCnt = 0;
        visited[parent] = true;

        for(int i : tree[parent] ) {
            if(!visited[i])
                childCnt += dfs(i);
        }

        if (childCnt == 0) {
            return child[parent] = 1;
        } else {
            return child[parent] = childCnt + 1;
        }
    }
}
