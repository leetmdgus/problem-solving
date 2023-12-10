package 백준.실버.실버4.Ex11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i =0; i<n; i++) {
            heap.add(Integer.parseInt(st.nextToken()));
        }

        int sum = 0;
        int[] hap = new int[n];
        for (int i = 0; i < n; i++) {
            hap[i] = heap.poll();
            if (i != 0) {
                hap[i] += hap[i - 1];
            }

            sum += hap[i];
        }

        System.out.println(sum);
    }
}