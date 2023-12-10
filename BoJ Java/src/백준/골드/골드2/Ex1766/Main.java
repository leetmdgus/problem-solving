package 백준.골드.골드2.Ex1766;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;

    static ArrayList<Integer>[] list;
    static int[] cntOfLink;

    static StringBuilder sb= new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cntOfLink = new int[N+1];

        list = new ArrayList[N+1];
        for(int i = 1; i<=N; i++) list[i] = new ArrayList<>();

        for(int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            cntOfLink[b]++;
        }

        topologicalSort();
        System.out.println(sb);
    }

    public static void topologicalSort() {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 1; i<=N; i++) {
            if(cntOfLink[i] == 0) {
                q.add(i);
            }
        }

        while(!q.isEmpty()) {
            int now = q.poll();
            sb.append(now).append(' ');

            for(int next : list[now]){
                cntOfLink[next]--;

                if(cntOfLink[next] == 0) {
                    q.add(next);
                }
            }
        }
    }
}
