package 백준.골드.골드5.Ex17352;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        parent = new int[n+1];
        for(int i = 1; i<=n; i++) parent[i] = i;

        for(int i = 0; i<n-2; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b);
        }

        StringBuilder sb= new StringBuilder();
        int land1 = find(1);
        int land2 = -1;
        for(int i = 2; i<=n ;i++) {
            int land = find(i);
            if(land != land1) {
                land2 = land;
            }
        }

        sb.append(land1 + " " + land2);
        System.out.println(sb);
    }

    public static int find(int x) {
        if(parent[x] == x) return x;
        else return parent[x] = find(parent[x]);
    }
    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        int min = Math.min(x, y);
        int max = Math.max(x, y);

        parent[max] = min;
    }
}
