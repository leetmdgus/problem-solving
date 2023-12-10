package 백준.실버.실버2.Ex2751;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i<n; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }

        while(!queue.isEmpty()) {
            sb.append(queue.poll()).append('\n');
        }
        System.out.println(sb);
    }
}
