package 백준.골드.골드5.Ex14567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static ArrayList<Integer>[] nodes;
    static int[] parentCnt;
    static int[] semester;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        parentCnt = new int[N + 1];
        semester = new int[N + 1];
        nodes = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            nodes[a].add(b);
            parentCnt[b]++;
        }


        topologicalSort();

        for(int i = 1; i<=N ;i++) {
            System.out.print(semester[i] + " ");
        }

    }

    public static void topologicalSort() {
        Queue<int[]> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            if (parentCnt[i] == 0) {
                q.add(new int[]{i, 1});
            }
        }

        while (!q.isEmpty()) {
            int[] now = q.poll();
            semester[now[0]] = now[1];

            for (int next : nodes[now[0]]) {
                parentCnt[next]--;

                if (parentCnt[next] == 0) {
                    q.add(new int[]{next, now[1] + 1});
                }
            }
        }
    }
}
