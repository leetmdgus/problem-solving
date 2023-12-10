package 백준.골드.골드1.Ex10868;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long[] arr, tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new long[n+1];
        tree = new long[n*4];

        for(int i = 1; i<=n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        init(1, n, 1);

        StringBuilder sb =new StringBuilder();
        for(int i = 0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(find(1, n, 1, a, b)).append("\n");
        }
        System.out.println(sb);
    }

    public static long init(int start, int end, int node) {
        if(start == end) return tree[node] = arr[start];
        int mid = (start + end) / 2;
        return tree[node] = Math.min(init(start, mid, node*2), init(mid+1, end, node*2+1));
    }

    public static long find(int start, int end, int node, int left, int right) {
        if(left > end || right < start) return Long.MAX_VALUE;
        if(left <= start && right >= end) return tree[node];
        int mid = (start + end) / 2;
        return Math.min(find(start, mid, node*2, left, right), find(mid+1, end, node*2+1, left, right));
    }
}
