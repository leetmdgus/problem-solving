package 백준.실버.실버3.Ex2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, l, cnt;
    public static boolean[][] connect;
    public static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        l = Integer.parseInt(br.readLine());

        connect = new boolean[n+1][n+1];
        check = new boolean[n+1];

        for(int i = 0; i< l; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            connect[a][b] = true;
            connect[b][a] = true;
        }

        dfs(1);
        System.out.println(cnt-1);
    }

    public static void dfs(int depth) {
        if(check[depth]) {
            return;
        }

        check[depth] = true;
        cnt++;
        for(int i = 1; i<=n; i++) {
            if(connect[depth][i] && !check[i]) {
                dfs(i);
            }
        }
    }
}
