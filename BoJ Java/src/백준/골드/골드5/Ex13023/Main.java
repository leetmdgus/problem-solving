package 백준.골드.골드5.Ex13023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;
    public static ArrayList<ArrayList<Integer>> arr;
    public static boolean[] check;

    public static boolean flag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            arr.add(new ArrayList());
        }

        for(int i = 0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());

            arr.get(p1).add(p2);
            arr.get(p2).add(p1);
        }

        for(int i = 0; i<n; i++) {
            if(flag) break;
            check = new boolean[n];
            dfs(0, i);
        }

        System.out.println(flag ? 1 : 0);
    }


    public static void dfs(int depth, int start) {
        if (flag) return;

        if(depth == 5) {
            flag = true;
            return;
        }

        for(int num : arr.get(start)) {
            if(!check[num]) {
                check[num] = true;
                dfs(depth+1, num);
                check[num] = false;
            }
        }
    }
}
