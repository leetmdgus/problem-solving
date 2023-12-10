package 백준.실버.실버1.Ex11403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int[][] arr;
    public static int[][] res;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        res = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num; // i->j 로 가는 간선이 있음. : 1,  없음 :0
                res[i][j] = num;
            }
        }

        for (int i = 0; i < N; i++) {
            visited = new boolean[N];
            move(i, i);
        }

        StringBuilder sb = new StringBuilder();
        for(int[] resArr : res) {
            for(int r : resArr) {
                sb.append(r).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void move(int init, int start) {
        for (int i = 0; i < N; i++) {
            if (arr[start][i] == 1 && !visited[i]) {
                visited[i] = true;
                res[init][i] = 1;
                move(init, i);
            }
        }

    }
}
