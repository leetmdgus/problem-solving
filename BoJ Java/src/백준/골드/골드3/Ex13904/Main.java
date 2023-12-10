package 백준.골드.골드3.Ex13904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> {
            if(o1[0] == o2[0]) {
                return o2[1] - o1[1];
            }
            return o2[0] - o1[0];
        });

        for(int i = 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            heap.add(new int[]{d, w});
        }

        int day = heap.peek()[0];
        int sum = 0;
        for(int i = day; i >= 1; i--) {
            PriorityQueue<int[]> heap2 = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
            while(!heap.isEmpty() && heap.peek()[0] >= i) {
                heap2.add(heap.poll());
            }
            if(!heap2.isEmpty()) {
                sum += heap2.poll()[1];
            }

            while(!heap2.isEmpty()) {
                heap.add(heap2.poll());
            }
        }
        System.out.println(sum);
    }
}
