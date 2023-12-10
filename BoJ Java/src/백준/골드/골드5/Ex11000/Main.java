package 백준.골드.골드5.Ex11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {
    static int n;
    static PriorityQueue<Integer> queue = new PriorityQueue<>();
    static int[][] time;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        time = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1]- b[1];
            }
            return a[0] - b[0];
        });

        for(int i = 0; i<n; i++) {
            int start = time[i][0];
            int end = time[i][1];

            if(!queue.isEmpty() && queue.peek() <= start) {
                queue.poll();
            }
            queue.add(end);
        }
        System.out.println(queue.size());
    }
}