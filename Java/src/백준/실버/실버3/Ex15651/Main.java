package 백준.실버.실버3.Ex15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visited = new boolean[n];

        dfs(n, m, 0);
        System.out.println(sb.toString());
    }

    public static void dfs(int n, int m, int depth) {
        if (m == depth) {
            for(int a : arr) {
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i<n; i++) {
            if(!visited[i]) {
                arr[depth] = i+1;
                dfs(n, m, depth+1);
            }
        }
    }
}
