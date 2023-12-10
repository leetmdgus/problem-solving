package 백준.골드.골드5.Ex22352;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;
    public static int[][] before;
    public static int[][] after;
    public static boolean[][] diff;

    public static boolean check = true;

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        before = new int[n][m];
        after = new int[n][m];
        diff = new boolean[n][m];

        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++) {
                before[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++) {
                after[i][j] = Integer.parseInt(st.nextToken());
                if(after[i][j] != before[i][j]) {
                    diff[i][j] = true;
                }
            }
        }

        visited = new boolean[n][m];

        int count = 0;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(!visited[i][j] && diff[i][j]) {
                    dfs(j, i);
                    count++;
                }
            }
        }
        System.out.println(check && count <= 1 ? "YES" : "NO");
    }

    public static void dfs(int x, int y) {
        int numB = before[y][x];
        int numA = after[y][x];

        visited[y][x] = true;

        for(int idx = 0; idx<4; idx++) {
            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;

            if(before[ny][nx] == numB && after[ny][nx] != numA ) {
                check = false;
            }

            if(!visited[ny][nx] && before[ny][nx] == numB) {
                dfs(nx, ny);
            }
        }
    }
}
