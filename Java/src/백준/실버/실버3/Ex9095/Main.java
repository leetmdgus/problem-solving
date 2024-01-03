package 백준.실버.실버3.Ex9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int count;
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(t-- > 0) {
            n = Integer.parseInt(br.readLine());
            count = 0;
            dfs(0, 0);
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    public static void dfs(int depth, int sum) {
        if(sum == n) {
            count++;
            return;
        }
        if(sum > n) {
            return;
        }

        for(int i = 1; i<=3; i++) {
            dfs(depth+1, sum + i);
        }
    }
}
