package 백준.골드.골드3.Ex11437;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    static int[] levelArr;
    static ArrayList<Integer>[] list;
    static int[] parentArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        list = new ArrayList[N + 1];
        levelArr = new int[N + 1];
        parentArr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        initLevel(1, 1); // root의 레벨 = 1로 한다.
        initParent(1, 1);

        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(LCA(a, b)).append('\n');
        }

        System.out.println(sb);
    }

    public static void initParent(int parent, int level) {
        for (int a : list[parent]) {
            if (levelArr[a] > level) {
                parentArr[a] = parent;
                initParent(a, level + 1);
            }
        }
    }

    public static void initLevel(int level, int parent) {
        if (levelArr[parent] != 0) return;

        levelArr[parent] = level;

        for (int a : list[parent]) {
            initLevel(level + 1, a);
        }
    }

    public static int LCA(int n1, int n2) {
        while (levelArr[n1] != levelArr[n2]) {
            if (levelArr[n1] > levelArr[n2]) {
                n1 = parentArr[n1];
            } else {
                n2 = parentArr[n2];
            }
        }

        while(n1 != n2) {
            n1 = parentArr[n1];
            n2 = parentArr[n2];
        }
        return n1;
    }
}
