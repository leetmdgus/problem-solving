package 백준.실버.실버5.Ex1417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        int N = Integer.parseInt(br.readLine());

        int dasom = Integer.parseInt(br.readLine());
        for(int i = 1; i<N; i++) {
            queue.offer(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        if(!queue.isEmpty()) {
            while(queue.peek() >= dasom) {
                int max = queue.poll();
                queue.offer(--max);
                dasom++;
                count++;
            }
        }
        System.out.println(count);
    }
}
