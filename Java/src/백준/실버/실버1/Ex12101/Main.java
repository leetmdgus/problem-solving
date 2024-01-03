package 백준.실버.실버1.Ex12101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static ArrayList<String> list = new ArrayList<>();
    public static int n, k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        dfs(new StringBuilder(), 0);
        Collections.sort(list);

        System.out.println(k <= list.size() ? list.get(k-1) : -1);
    }

    public static void dfs(StringBuilder sb, int sum) {
        if(sum > n) {
            return;
        }
        if(sum == n) {
            list.add(sb.toString());
        }

        for(int i = 1; i<=3; i++) {
            if(sb.length() == 0) {
                sb.append(i);
                dfs(sb, sum+i);
                sb.delete(sb.length()-1, sb.length());
            } else {
                sb.append('+');
                sb.append(i);
                dfs(sb, sum + i);
                sb.delete(sb.length()-2, sb.length());
            }
        }
    }
}
