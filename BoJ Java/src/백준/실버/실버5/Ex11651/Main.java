package 백준.실버.실버5.Ex11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++) {
            StringTokenizer st =new StringTokenizer(br.readLine());
            heap.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        StringBuilder sb = new StringBuilder();
        for(int i= 0; i<n; i++) {
            int[] xy = heap.poll();
            sb.append(xy[0]).append(" ").append(xy[1]).append('\n');
        }

        System.out.println(sb);

    }
}
