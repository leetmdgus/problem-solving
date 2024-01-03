package 백준.플래티넘.플래티넘3.Ex3830;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] parent;
    static int[] weight;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            parent = new int[n + 1];
            weight = new int[n + 1];

            for (int i = 1; i <= n; i++) parent[i] = i;

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                String q = st.nextToken();
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if (q.equals("!")) {
                    int w = Integer.parseInt(st.nextToken());
                    union(a, b, w);
                } else { // == if(q.equals("?"))
                    if(find(a) != find(b)) {
                        sb.append("UNKNOWN").append('\n');
                    } else {
                        sb.append(weight[b] - weight[a]).append('\n');
                    }
                }
            }
        }

        System.out.println(sb);
    }

    static int find(int x) {
        if (parent[x] == x) return x;
        else {
            int prv = find(parent[x]);
            weight[x] += weight[parent[x]];
            return parent[x] = prv;
        }
    }

    static void union(int x, int y, int w) {
        int pX = find(x);
        int pY = find(y);

        if(pX == pY) return;

        parent[pY] = pX;
        weight[pY] += (w - weight[y] + weight[x]);
    }
}
