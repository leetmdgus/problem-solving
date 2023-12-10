package 백준.브론즈.브론즈1.Ex27648.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int[] dx = {1, 0};
    public static int[] dy = {0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        arr[0][0] = 1;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] now = q.poll();

            for (int i = 0; i < 2; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx >= m || ny >= n) continue;
                if (arr[ny][nx] != 0) continue;

                arr[ny][nx] = arr[now[1]][now[0]] + 1;
                q.add(new int[]{nx, ny});
            }
        }

        StringBuilder sb= new StringBuilder();
        if(arr[n-1][m-1] > k) {
            sb.append("NO");
        }else {
            sb.append("YES").append("\n");
            for(int i = 0; i<n; i++) {
                for(int j = 0; j<m; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
