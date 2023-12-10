package 백준.골드.골드5.Ex16938;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int N, X, count;
    public static long L, R;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Long.parseLong(st.nextToken());
        R = Long.parseLong(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for(int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 2 ; i<=N; i++) {
            dfs(new int[i], 0, 0);
        }

        System.out.println(count);
    }


    public static void dfs(int[] makeArr, int depth, int start) {
        if(depth == makeArr.length) {
            if(check(makeArr)) {
                count++;
            }
            return;
        }

        for(int i = start; i<arr.length; i++) {
            makeArr[depth] = arr[i];
            dfs(makeArr, depth+1, i+1);
        }
    }

    public static boolean check(int[] arr) {
        long sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }

        int x = Math.abs(arr[0] - arr[arr.length-1]);
        if(sum >= L && sum <= R && x >= X) {
            return true;
        }
        return false;
    }
}
