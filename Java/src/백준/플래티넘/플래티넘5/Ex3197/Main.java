package 백준.플래티넘.플래티넘5.Ex3197;

import java.io.*;
import java.util.*;

public class Main {
    static int r, c, ex, ey;
    static char[][] map;
    static boolean[][] visited;

    static Queue<int[]> swanQ = new LinkedList<>();
    static Queue<int[]> waterQ = new LinkedList<>();

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new char[r][c];
        visited = new boolean[r][c];

        int sx = -1, sy = -1;
        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i][j] = str.charAt(j);
                if (map[i][j] == 'L') {
                    map[i][j] = '.';
                    if (sx == -1) {
                        sx = j;
                        sy = i;
                    } else {
                        ex = j;
                        ey = i;
                    }
                }
                if (map[i][j] == '.') {
                    waterQ.add(new int[]{j, i});
                }
            }
        }

        swanQ.add(new int[]{sx, sy});
        visited[sy][sx] = true;

        int time = 0;
        while (true) {
            if (move()) break;
            melting();
            time++;
        }

        System.out.println(time);
    }


    public static boolean move() {
        Queue<int[]> q = new LinkedList<>();

        while (!swanQ.isEmpty()) {
            int[] now = swanQ.remove();

            if (now[0] == ex && now[1] == ey) return true;

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= c || ny >= r || visited[ny][nx]) continue;
                visited[ny][nx] = true;

                if (map[ny][nx] == 'X') {
                    q.add(new int[]{nx, ny});
                } else {
                    swanQ.add(new int[]{nx, ny});
                }
            }
        }

        swanQ = q;
        return false;
    }

    public static void melting() {
        int size = waterQ.size();
        for (int i = 0; i < size; i++) {
            int[] now = waterQ.remove();

            for (int j = 0; j < 4; j++) {
                int nx = now[0] + dx[j];
                int ny = now[1] + dy[j];

                if (nx < 0 || ny < 0 || nx >= c || ny >= r) continue;
                if (map[ny][nx] == 'X') {
                    map[ny][nx] = '.';
                    waterQ.add(new int[]{nx, ny});
                }
            }
        }
    }
}