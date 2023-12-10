package 백준.실버.실버2.Ex2644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr; // 촌수 계산한 결과값을 넣을 array
    static ArrayList<Integer>[] child;
    static boolean[][] isReached;

    static int n1, n2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        isReached = new boolean[n + 1][2];

        arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == j) continue;
                arr[i][j] = -1;
            }
        }

        child = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            child[i] = new ArrayList<>();
        }

        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            child[x].add(y);
        }

        // 촌수 계산
        for (int i = 1; i <= n; i++) {
            dfs(i, i, 1);
        }

        int cnt = Integer.MAX_VALUE;
        for(int i = 1; i<=n; i++) {
            if(isReached[i][0] && isReached[i][1]) {
                cnt = Math.min(cnt, arr[i][n1] + arr[i][n2]);
            }
        }
        System.out.println(cnt == Integer.MAX_VALUE ? -1 : cnt);
    }

    public static void dfs(int ancestor, int parent, int chonsu) {
        if(parent == n1) isReached[ancestor][0] = true;
        if(parent == n2) isReached[ancestor][1] = true;

        for (int c : child[parent]) {
            arr[ancestor][c] = chonsu;
            arr[c][ancestor] = chonsu;
            dfs(ancestor, c, chonsu + 1);
        }
    }
}
