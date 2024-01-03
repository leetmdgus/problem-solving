package 백준.실버.실버2.Ex11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m, cnt;
    public static boolean[] check;
    public static boolean[][] connected;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        check = new boolean[n+1];
        connected = new boolean[n+1][n+1];

        for(int i = 0; i<m ;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            connected[a][b] = connected[b][a] = true;
        }

        for(int i = 1; i<=n ;i++) {
            if(!check[i]) {
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void dfs(int start) {
        if(check[start]) return;

        check[start] = true;
        for(int i = 1; i<=n ;i++) {
            if(connected[start][i] && !check[i]) {
                dfs(i);
            }
        }
    }
}
