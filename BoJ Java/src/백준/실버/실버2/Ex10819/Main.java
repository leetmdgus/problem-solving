package 백준.실버.실버2.Ex10819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static int n;
    public static int max;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st= new StringTokenizer(br.readLine());
        arr = new int[n];
        visited = new boolean[n];

        for(int i = 0; i<n ;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(new int[n], 0);
        System.out.println(max);
    }

    public static void dfs(int[] makeArr, int depth) {
        if(depth == makeArr.length) {
            int num = calculation(makeArr);
            max = Math.max(num, max);
            return;
        }

        for(int i = 0; i<n ;i++) {
            if(!visited[i]) {
                visited[i] = true;
                makeArr[depth] = arr[i];
                dfs(makeArr, depth+1);
                visited[i] = false;
            }
        }
    }

    public static int calculation(int[] arr) {
        int ans = 0;
        for(int i= 0; i<arr.length-1; i++) {
            ans += Math.abs(arr[i] - arr[i+1]);
        }
        return ans;
    }
}
