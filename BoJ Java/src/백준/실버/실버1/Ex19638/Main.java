package 백준.실버.실버1.Ex19638;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        while(N-- > 0) {
            queue.offer(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        while(T-- > 0) {
            int height = queue.poll();
            if(height != 1 && height >= H) {
                queue.offer(height/2);
            } else {
                queue.offer(height);
                break;
            }
            count++;
        }

        if(queue.peek() >= H) {
            System.out.println("NO");
            System.out.println(queue.peek());
        } else {
            System.out.println("YES");
            System.out.println(count);
        }
    }
}
