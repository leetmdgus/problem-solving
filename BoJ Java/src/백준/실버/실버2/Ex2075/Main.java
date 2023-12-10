package 백준.실버.실버2.Ex2075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        StringTokenizer st;
        for(int i = 0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<num; j++) {
                queue.offer(Integer.parseInt(st.nextToken()));
            }
        }

        for(int i = 0; i<num-1; i++){
            queue.poll();
        }

        System.out.println(queue.peek());
    }
}
