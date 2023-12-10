package 백준.브론즈.브론즈2.Ex10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        for(int i = 1; i<=n ;i++) arr[i] = i;

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            Stack<Integer> stack = new Stack<>();
            for(int i = start; i<=end; i++) {
                stack.add(arr[i]);
            }
            for(int i = start; i<=end ;i++) {
                arr[i] = stack.pop();
            }
        }

        StringBuilder sb= new StringBuilder();
        for(int i = 1; i<= n; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
    }
}
