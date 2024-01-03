package 백준.골드.골드3.Ex1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, K, W;
    static int[] delay;
    static int[] maxDelay;
    static int[] cntEdge;
    static ArrayList<Integer>[] list;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            delay = new int[N + 1];
            maxDelay = new int[N + 1];
            cntEdge = new int[N + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                delay[i] = Integer.parseInt(st.nextToken());
            }

            list = new ArrayList[N + 1];
            for (int i = 1; i <= N; i++) list[i] = new ArrayList<>();

            for (int i = 1; i <= K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                list[x].add(y);
                cntEdge[y]++;
            }

            W = Integer.parseInt(br.readLine());
            topologicalSort();
        }

        System.out.println(sb);
    }

    public static void topologicalSort() {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (cntEdge[i] == 0) {
                q.add(i);
                maxDelay[i] = delay[i];
            }
        }

        while (!q.isEmpty()) {
            int now = q.remove();

            if (now == W) {
                sb.append(maxDelay[now]).append('\n');
                return;
            }

            for (int next : list[now]) {
                cntEdge[next]--;
                maxDelay[next] = Math.max(maxDelay[now] + delay[next], maxDelay[next]);

                if (cntEdge[next] == 0) {
                    q.add(next);
                }
            }
        }
    }
}
