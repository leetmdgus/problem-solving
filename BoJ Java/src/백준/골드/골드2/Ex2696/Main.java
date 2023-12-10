package 백준.골드.골드2.Ex2696;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

            int count = 0;
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();


            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                if (i != 0 && i % 10 == 0) {
                    st = new StringTokenizer(br.readLine());
                }

                int num = Integer.parseInt(st.nextToken());

                if (minHeap.size() == maxHeap.size()) {
                    maxHeap.add(num);
                } else {
                    minHeap.add(num);
                }

                if (minHeap.size() == 0) {
                    count = 1;
                    sb.append(maxHeap.peek() + " ");
                    continue;
                }

                if (maxHeap.peek() > minHeap.peek()) {
                    int maxTmp = maxHeap.poll();
                    int minTmp = minHeap.poll();
                    minHeap.add(maxTmp);
                    maxHeap.add(minTmp);
                }

                if ((i + 1) % 2 != 0) {
                    count++;
                    sb.append(maxHeap.peek() + " ");
                    if (count == 10) {
                        sb.append("\n");
                    }
                }
            }

            ans.append(count + "\n");
            ans.append(sb + "\n");
        }

        System.out.println(ans);
    }
}
