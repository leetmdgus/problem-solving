package 백준.실버.실버2.Ex15666;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    public static HashSet<String> set = new LinkedHashSet<>();
    public static int n, m;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(new int[m], 0);
        set.forEach(System.out::println);
    }

    public static void dfs(int[] makeArr, int depth) {
        if(depth == makeArr.length) {
            StringBuilder sb= new StringBuilder();
            for(int i = 0; i< makeArr.length; i++) {
                sb.append(makeArr[i]).append(" ");
            }
            set.add(sb.toString());
            return;
        }

        for(int i = 0; i<n ;i++) {
            int num = arr[i];
            if(depth == 0) {
                makeArr[depth] = num;
                dfs(makeArr, depth+1);
                continue;
            }
            if(makeArr[depth-1] <= num) {
                makeArr[depth] = num;
                dfs(makeArr, depth+1);
            }
        }
    }
}
