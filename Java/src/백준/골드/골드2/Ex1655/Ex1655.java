package 백준.골드.골드2.Ex1655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Ex1655 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            int num = Integer.parseInt(br.readLine());

            if (maxHeap.size() == minHeap.size()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }

            if (minHeap.isEmpty()) {
                sb.append(maxHeap.peek()).append('\n');
                continue;
            }

            if (minHeap.peek() < maxHeap.peek()) {
                int maxTmp = maxHeap.poll();
                int minTmp = minHeap.poll();
                maxHeap.offer(minTmp);
                minHeap.offer(maxTmp);
            }

            if (maxHeap.size() > minHeap.size()) {
                sb.append(maxHeap.peek()).append('\n');
            } else {
                sb.append(maxHeap.peek() < minHeap.peek() ? maxHeap.peek() : minHeap.peek()).append('\n');
            }
        }

        System.out.println(sb);
    }
}
