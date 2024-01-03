package 백준.실버.실버2.Ex15663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int N, M;
    public static int[] inputArr;
    public static boolean[] visited;
    public static StringBuilder sb= new StringBuilder();

    public static Set<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        inputArr = new int[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            inputArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(inputArr);
        dfs(new int[M], 0);

        set.forEach(System.out::println);
    }

    public static void dfs(int[] makeArr, int depth) {
        if(makeArr.length == depth) {
            StringBuilder sb =new StringBuilder();
            for(int i = 0; i<makeArr.length; i++) {
                sb.append(makeArr[i]).append(" ");
            }
            set.add(sb.toString());
            return;
        }

        for(int i= 0; i<N;i++) {
            if(!visited[i]) {
                visited[i] = true;
                makeArr[depth] = inputArr[i];
                dfs(makeArr, depth+1);
                visited[i] = false;
            }
        }
    }
}
