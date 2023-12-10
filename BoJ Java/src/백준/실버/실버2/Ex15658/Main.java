package 백준.실버.실버2.Ex15658;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static int[] operArr;
    public static boolean[] visited;
    public static int n;

    public static int max= Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0; i<n ;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        operArr = new int[4];
        for(int i = 0; i<4; i++) {
            operArr[i] = Integer.parseInt(st.nextToken());
        }

        visited = new boolean[operArr.length];

        dfs(1, arr[0]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int depth, int sum) {
        if(depth == n) {
            max = Math.max(sum, max);
            min = Math.min(sum, min);
            return;
        }

        for(int j = 0; j < 4; j++) {
            if(operArr[j] ==  0) continue;

            operArr[j]--;
            switch (j) {
                case 0 :
                    dfs(depth+1, sum + arr[depth]);
                    break;
                case 1 :
                    dfs(depth+1, sum - arr[depth]);
                    break;
                case 2 :
                    dfs(depth+1, sum * arr[depth]);
                    break;
                case 3 :
                    dfs(depth+1, sum / arr[depth]);
                    break;
            }
            operArr[j]++;
        }
    }
}
