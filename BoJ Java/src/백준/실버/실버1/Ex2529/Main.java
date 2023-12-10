package 백준.실버.실버1.Ex2529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] choice = new boolean[10];
    public static int n;
    public static int[] arr;
    public static Long max = Long.MIN_VALUE, min = Long.MAX_VALUE;
    public static String maxStr = "";
    public static String minStr = "";
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0; i<n ;i++) {
            arr[i] = st.nextToken().equals("<") ? 0 : 1;
        }

        dfs(new int[n+1], 0);
        System.out.println(maxStr);
        System.out.println(minStr);
    }

    public static void dfs(int[] makeArr, int depth) {
        if(depth == n+1) {
            StringBuilder sb= new StringBuilder();
            for(int i = 0; i<makeArr.length; i++) {
                sb.append(makeArr[i]);
            }

            Long num = Long.parseLong(sb.toString());
            if(num > max) {
                max = num;
                maxStr = sb.toString();
            } else if(num < min) {
                min = num;
                minStr = sb.toString();
            }
            return;
        }

        for(int i = 9; i>=0; i--) {
            if(!choice[i]) {
                choice[i] = true;
                makeArr[depth] = i;
                if(depth == 0) {
                    dfs(makeArr, depth+1);
                } else {
                    if(arr[depth-1] == 0 && makeArr[depth-1] < makeArr[depth] || arr[depth-1] == 1 && makeArr[depth-1] > makeArr[depth]) {
                        dfs(makeArr, depth+1);
                    }
                }
                choice[i] = false;
            }
        }
    }
}
