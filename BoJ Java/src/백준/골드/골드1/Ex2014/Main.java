package 백준.골드.골드1.Ex2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        PriorityQueue<Long> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());

        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            pq.add(arr[i]);
        }

        long ans = 0;
        while (M-- > 0) {
            ans = pq.remove();

            for (int i = 0; i < N; i++) {
                if(ans * arr[i] >= Math.pow(2, 31)) break;
                pq.add(ans * arr[i]);
                if(ans % arr[i] == 0) break;
            }
        }

        System.out.println(ans);
    }
}
