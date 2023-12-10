package 백준.실버.실버1.Ex15903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        PriorityQueue<Long> heap = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n ;i++){
            heap.add(Long.parseLong(st.nextToken()));
        }

        for(int i = 0; i<m; i++) {
            long a = heap.poll();
            long b = heap.poll();
            heap.offer(a+b);
            heap.offer(a+b);
        }

        long sum = 0;
        while(!heap.isEmpty()) {
            sum +=  heap.poll();
        }
        System.out.println(sum);
    }
}
