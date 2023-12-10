package 백준.골드.골드1.Ex3665;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] teams;
    static ArrayList<Integer>[] list;
    static int[] cntOfLink;

    static StringBuilder ans = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            N = Integer.parseInt(br.readLine()); // 팀의 수

            cntOfLink = new int[N + 1];
            list = new ArrayList[N + 1];
            for (int i = 0; i <= N; i++) list[i] = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());

            teams = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                teams[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= N; i++) {
                int b = teams[i];
                for (int j = 1; j < i; j++) {
                    int a = teams[j];

                    list[a].add(b);
                    cntOfLink[b]++;
                }
            }

            M = Integer.parseInt(br.readLine());

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if (list[a].contains(b)) {
                    int tmp = b; b = a; a = tmp;
                }

                list[b].remove(Integer.valueOf(a));
                cntOfLink[a]--;

                list[a].add(b);
                cntOfLink[b]++;
            }

            topologicalSort();
        }

        System.out.println(ans);
    }

    public static void topologicalSort() {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < cntOfLink.length; i++) {
            if (cntOfLink[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int now = q.poll();
            arr.add(now);

            for (int next : list[now]) {
                cntOfLink[next]--;

                if (cntOfLink[next] == 0) {
                    q.add(next);
                }
            }
        }

        if (arr.size() != N) ans.append("IMPOSSIBLE\n");
        else {
            for(int n : arr) {
                ans.append(n).append(' ');
            }
            ans.append('\n');
        }
    }
}
