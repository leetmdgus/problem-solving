package 백준.브론즈.브론즈5.Ex2738;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] res = new int[n][m];
        int num = 2;
        while(num-- > 0) {
            for(int i = 0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j<m;j++) {
                    res[i][j] += Integer.parseInt(st.nextToken());
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n ;i++) {
            for(int j = 0; j<m; j++) {
                sb.append(res[i][j]+" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
