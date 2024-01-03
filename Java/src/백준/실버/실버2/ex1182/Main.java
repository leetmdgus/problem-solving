package 백준.실버.실버2.ex1182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int count = 0;
    public static int n, s;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i<=n ;i++) {
            dfs(new int[i], 0, 0);
        }
        System.out.println(count);
    }

    public static void dfs(int[] makeArr, int depth, int start) {
        if(depth == makeArr.length) {
            if(sum(makeArr) == s) {
                count++;
            }
            return;
        }

        for(int i = start; i< arr.length; i++) {
            makeArr[depth] = arr[i];
            dfs(makeArr, depth+1, i+1);
        }
    }

    public static int sum(int[] arr) {
        int answer = 0;
        for(int i = 0; i<arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}
