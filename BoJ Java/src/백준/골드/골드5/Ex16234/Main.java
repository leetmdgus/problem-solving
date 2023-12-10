package 백준.골드.골드5.Ex16234;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, L, R;
    static int[][] map;
    static boolean[][] visited;
    static int time;

    public static void main(String[] args) throws IOException {
        input();
        move();
        System.out.println(time);
    }

    static boolean moveFlag = true;
    public static void move() {
        while(true) {
            moveFlag = false;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        bfs(j, i);
                    }
                }
            }
            if(!moveFlag) return;
            time++;
        }
    }

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void bfs(int x, int y) {
        Queue<Coordinate> q = new LinkedList<>();
        q.add(new Coordinate(x, y));
        visited[y][x] = true;

        ArrayList<Coordinate>  saveVisited = new ArrayList<>();
        saveVisited.add(new Coordinate(x, y));
        int sum = map[y][x];

        while (!q.isEmpty()) {
            Coordinate now = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + now.x;
                int ny = dy[i] + now.y;

                if (nx < 0 || ny < 0 || nx >= N || ny >= N || visited[ny][nx]) continue;
                int diff = Math.abs(map[now.y][now.x] - map[ny][nx]);
                if (diff < L || diff > R) continue;

                q.add(new Coordinate(nx, ny));
                saveVisited.add(new Coordinate(nx, ny));
                sum += map[ny][nx];
                visited[ny][nx] = true;
            }
        }

        if (saveVisited.size() > 1) {
            moveFlag = true;
            changePopulation(sum, saveVisited);
        }
    }

    public static void changePopulation(int sum, ArrayList<Coordinate> list) {
        int avg = sum / list.size();
        for (Coordinate now : list) {
            map[now.y][now.x] = avg;
        }
    }

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static class Coordinate {
        int x, y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
