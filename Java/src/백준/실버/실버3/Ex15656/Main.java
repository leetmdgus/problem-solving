package 백준.실버.실버3.Ex15656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int n, m;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(new int[m], 0);
        System.out.println(sb);
    }

    public static void dfs(int[] makeArr, int depth) {
        if(makeArr.length == depth) {
            for(int i = 0; i<makeArr.length; i++) {
                sb.append(makeArr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i<n; i++) {
            makeArr[depth] = arr[i];
            dfs(makeArr, depth+1);
        }
    }
}
