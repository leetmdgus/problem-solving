package 백준.실버.실버3.Ex16922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i<=n ;i++) {
            dfs(i, 0, 0);
        }

        System.out.println(count);
    }

    public static void dfs(int length, int depth, int start) {
        if(length == depth) {
            count++;
            return;
        }

        for(int i = start; i<4; i++) {
            dfs(length, depth+1, i);
        }
    }
}
