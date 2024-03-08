package 백준.실버.실버2.Ex5567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int cnt;
    static int n, m;
    static boolean[] invited;
    static ArrayList<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        list = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        invited = new boolean[n + 1];

        invited[1] = true;
        dfs(0, 1);

        System.out.println(cnt);
    }

    public static void dfs(int depth, int node) {
        if (depth == 2) return;

        for (int next : list[node]) {
            if (!invited[next]) {
                cnt++;
            }
            invited[next] = true;
            dfs(depth + 1, next);
        }
    }
}
