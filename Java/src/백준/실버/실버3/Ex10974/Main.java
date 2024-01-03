package 백준.실버.실버3.Ex10974;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean[] visited;
    public static int n;
    public static StringBuilder sb= new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n+1];

        dfs(new int[n], 0);

        System.out.println(sb);
    }

    public static void dfs(int[] makeArr, int depth) {
        if(depth == n) {
            for(int i = 0; i<depth; i++) {
                sb.append(makeArr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i<=n ;i++) {
            if(!visited[i]) {
                visited[i] = true;
                makeArr[depth] = i;
                dfs(makeArr, depth+1);
                visited[i] = false;
            }
        }
    }
}
