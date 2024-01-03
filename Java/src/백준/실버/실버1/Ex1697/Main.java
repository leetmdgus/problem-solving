package 백준.실버.실버1.Ex1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int N, K;
    public static int ans;
    public static int[] time = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N != K) {
            dfs();
        }

        System.out.println(ans);
    }

    public static void dfs() {
        Queue<Integer> queue = new LinkedList();
        queue.add(N);

        while (!queue.isEmpty()) {
            int n = queue.poll();
            if (n == K) {
                ans = time[n];
                return;
            }

            if (n + 1 < time.length && time[n + 1] == 0) {
                time[n + 1] = time[n] + 1;
                queue.add(n + 1);
            }
            if (n - 1 >= 0 && time[n - 1] == 0) {
                time[n - 1] = time[n] + 1;
                queue.add(n - 1);
            }
            if (n * 2 < time.length && time[n * 2] == 0) {
                time[n * 2] = time[n] + 1;
                queue.add(n * 2);
            }
        }
    }
}