package 백준.골드.골드2.Ex13415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n ;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int k = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        while(k-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int i = 0 ; i < a; i++) {
                minHeap.add(arr[i]);
            }

            for(int j = 0; j< b; j++) {
                if(minHeap.size()!= 0) {
                    maxHeap.add(minHeap.poll());
                } else {
                    maxHeap.add(arr[j]);
                }
            }

            for(int i = 0; i<n; i++) {
                if(!maxHeap.isEmpty()) {
                    arr[i] = maxHeap.poll();
                } else if(!minHeap.isEmpty()){
                    arr[i] = minHeap.poll();
                }
            }
        }

        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}