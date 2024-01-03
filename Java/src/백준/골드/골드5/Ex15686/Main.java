package 백준.골드.골드5.Ex15686;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int min = Integer.MAX_VALUE;
    public static int n, m;
    public static boolean[] open;
    public static ArrayList<Point> person;
    public static ArrayList<Point> chicken;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        person = new ArrayList<>();
        chicken = new ArrayList<>();

        for(int i = 0; i<n ;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num == 1) {
                    person.add(new Point(j, i));
                } else if(num == 2) {
                    chicken.add(new Point(j, i));
                }
            }
        }

        open = new boolean[chicken.size()];

        dfs( 0, 0);
        System.out.println(min);
    }

    public static void dfs(int start, int depth) {
        if(depth == m) {
            int res = 0;
            for(int i = 0; i< person.size(); i++) {
                int tmp = Integer.MAX_VALUE;

                for(int j = 0; j< chicken.size(); j++) {
                    if(open[j]) {
                        int distance = Math.abs(person.get(i).x - chicken.get(j).x)
                                + Math.abs(person.get(i).y - chicken.get(j).y);
                        tmp = Math.min(tmp, distance);
                    }
                }
                res += tmp;
            }
            min = Math.min(res, min);
            return;
        }

        for(int i = start; i< chicken.size(); i++) {
            open[i] = true;
            dfs(i+1, depth+1);
            open[i] = false;
        }
    }
}
