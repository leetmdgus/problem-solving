package 백준.골드.골드3.Ex2623;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;

    static ArrayList<Integer>[] list;
    static int[] cntOfLink;

    static ArrayList<Integer> ans = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cntOfLink = new int[N + 1];
        list = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) list[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n+1];

            for (int j = 1; j <= n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    int front = arr[j];
                    int end = arr[k];

                    list[front].add(end);
                    cntOfLink[end]++;
                }
            }
        }

        topologicalSort();
        if (ans.size() == N) {
            ans.stream().forEach(System.out::println);
        } else {
            System.out.println(0);
        }
    }

    public static void topologicalSort() {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < cntOfLink.length; i++) {
            if (cntOfLink[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int now = q.poll();
            ans.add(now);

            for (int next : list[now]) {
                cntOfLink[next]--;

                if (cntOfLink[next] == 0) {
                    q.add(next);
                }
            }
        }
    }
}
