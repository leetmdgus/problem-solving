package 백준.골드.골드5.Ex2170;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<long[]> heap = new PriorityQueue<>((o1, o2) -> {
            if(o1[0] == o2[0]) return o1[1] - o2[1] > 0 ? 1 : -1;
            return o1[0] - o2[0] > 0 ? 1 : -1;
        });
        
        for(int i = 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            heap.add(new long[]{x, y});
        }

        long total = 0;
        long[] pos = heap.poll();
        long length =  Math.abs(pos[1] - pos[0]);

        while(!heap.isEmpty()) {
            long[] now = heap.poll();

            if(now[0] > pos[1]) {
                total += length;
                pos[0] = now[0];
            }
            if(now[1] > pos[1]) {
                pos[1] = now[1];
            }
            length = Math.abs(pos[1] - pos[0]);
        }

        total += length;
        System.out.println(total);
    }
}
