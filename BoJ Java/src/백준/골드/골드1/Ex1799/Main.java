package 백준.골드.골드1.Ex1799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] arr;
    static boolean[][] visited;

    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visited = new boolean[n][n];
                if (arr[i][j] == 1) {
                    arr[i][j] = 2;
                    dfs(j, i, 1);
                    arr[i][j] = 1;
                }
            }
        }

        System.out.println(max);
    }

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void dfs(int x, int y, int cnt) {
        max = Math.max(max, cnt);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
            if (visited[ny][nx] || arr[ny][nx] == 2) continue;

            visited[ny][nx] = true;
            if(arr[ny][nx] == 0) {
                dfs(nx, ny, cnt);
                continue;
            }

            if (!isValid(nx, ny)) {
                dfs(nx, ny, cnt);
            } else {
                arr[ny][nx] = 2;
                dfs(nx, ny, cnt+1);
                arr[ny][nx] = 1;
            }
        }
    }

    public static boolean isValid(int x, int y) {
        int leftX = x, leftY = y;
        int rightX = x, rightY = y;

        while (leftX != 0 && leftY != 0) {
            leftX--;
            leftY--;
        }

        while (rightX != n - 1 && rightY != 0) {
            rightX++;
            rightY--;
        }

        while (leftX < n && leftY < n) {
            if (arr[leftY++][leftX++] == 2) {
                return false;
            }
        }

        while (rightX >= 0 && rightY < n) {
            if (arr[rightX--][rightY++] == 2) {
                return false;
            }
        }

        return true;
    }
}
