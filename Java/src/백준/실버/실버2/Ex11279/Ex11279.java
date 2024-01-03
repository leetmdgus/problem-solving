package 백준.실버.실버2.Ex11279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Ex11279 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(repeat-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                if(queue.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(queue.poll()).append('\n');
                }
            } else {
                queue.offer(num);
            }
        }
        System.out.println(sb);
    }
}
