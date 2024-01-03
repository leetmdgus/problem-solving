package 백준.골드.골드5.Ex23943;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue();
        st = new StringTokenizer(br.readLine());

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int t = arr[i];
            if (pq.size() < m) {
                pq.add(t);
                continue;
            }
            int min = pq.poll();
            pq.add(min + t);
        }

        while (pq.size() != 1) pq.poll();
        System.out.println(pq.peek());
    }
}
