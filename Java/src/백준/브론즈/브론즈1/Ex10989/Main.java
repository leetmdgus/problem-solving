package 백준.브론즈.브론즈1.Ex10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        while(n-- > 0) {
            heap.add(Integer.parseInt(br.readLine()));
        }

        StringBuilder sb = new StringBuilder();
        while(!heap.isEmpty()) {
            sb.append(heap.poll()).append("\n");
        }
        System.out.println(sb);

    }
}

