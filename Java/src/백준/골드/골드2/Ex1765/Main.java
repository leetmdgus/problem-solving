package 백준.골드.골드2.Ex1765;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] parent;
    static ArrayList<Integer>[] enemy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) parent[i] = i;

        enemy = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) enemy[i] = new ArrayList();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String relation = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (relation.equals("F")) {
                union(a, b);
            } else {
                enemy[a].add(b);
                enemy[b].add(a);
            }
        }

        for (int i = 1; i <= N; i++) {
            if (enemy[i].size() >= 2) {
                for (int j = 1; j < enemy[i].size(); j++) {
                    union(enemy[i].get(j-1), enemy[i].get(j));
                }
            }
        }

        Set set = new HashSet();
        for (int i = 1; i <= N; i++) {
            set.add(find(i));
        }
        System.out.println(set.size());
    }

    public static int find(int x) {
        if (parent[x] == x) return x;
        else return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x == y) return;

        parent[Math.max(x, y)] = Math.min(x, y);
    }
}
