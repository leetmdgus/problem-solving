package 백준.실버.실버1.Ex2178;
// 시간 초과
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static int n, m, min = Integer.MAX_VALUE;
    public static boolean[][] visited;
    public static int[][] board;

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n][m];
        board = new int[n][m];

        for(int i = 0; i<n ;i++) {
            String[] arr = br.readLine().split("");
            for(int j = 0; j<m; j++) {
                board[i][j] = Integer.parseInt(arr[j]);
            }
        }

        dfs(1, 0, 0);
        System.out.println(min);
    }

    public static void dfs(int depth, int x, int y) {
        if(y == n-1 && x == m-1) {
            min = Math.min(min, depth);
            return;
        }

        for(int i = 0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= m || ny < 0 || ny >= n) {
                continue;
            }

            if(!visited[ny][nx] && board[ny][nx] == 1) {
                visited[ny][nx] = true;
                dfs(depth+1, nx, ny);
                visited[ny][nx] = false;
            }
        }
    }
}
