package 백준.실버.실버5.Ex11931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0 ; i<t; i++) {
            heap.add(Integer.parseInt(br.readLine()));
        }

        StringBuilder sb =new StringBuilder();
        while(heap.size() != 0) {
            sb.append(heap.poll()).append("\n");
        }
        System.out.println(sb);
    }
}
