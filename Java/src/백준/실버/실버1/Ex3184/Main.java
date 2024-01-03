package 백준.실버.실버1.Ex3184;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int sheep, wolf;
    public static int n, m;
    public static String[][] arr;
    public static boolean[][] visited;
    public static int[] dx = {0, -1, 0, 1, 0};
    public static int[] dy = {1, 0, 0, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new String[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                arr[i][j] = input[j];
            }
        }
        int s = 0;
        int w = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sheep = 0;
                wolf = 0;
                if (!visited[i][j]) {
                    dfs(j, i);
                    if (sheep > wolf) {
                        s += sheep;
                    } else {
                        w += wolf;
                    }
                }
            }
        }

        System.out.println(s + " " + w);
    }

    public static void dfs(int x, int y) {
        for (int idx = 0; idx < 5; idx++) {
            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if (nx < 0 || ny < 0 || nx >= m || ny >= n) {
                continue;
            }
            if(arr[ny][nx].equals("#")){
                continue;
            }

            if (!visited[ny][nx]) {
                visited[ny][nx] = true;
                if (arr[ny][nx].equals("v")) {
                    wolf++;
                } else if (arr[ny][nx].equals("o")) {
                    sheep++;
                }

                dfs(nx, ny);
            }
        }
    }
}
