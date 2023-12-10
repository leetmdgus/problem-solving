package 백준.골드.골드1.Ex11003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<int[]> q = new ArrayDeque<>();    // 0: value, 1: index
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i= 0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            while(!q.isEmpty() && q.peekLast()[0] > num) {
                q.pollLast();
            }

            q.offer(new int[] {num,i});
            if(q.peekFirst()[1] < i -(L-1)) {
                q.pollFirst();
            }

            sb.append(q.peek()[0]).append(" ");
        }
        System.out.println(sb);
    }
}
