package 백준.실버.실버5.Ex2822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> o2[0] - o1[0]);

        for(int i = 1; i<=8; i++) {
            heap.add(new int[]{Integer.parseInt(br.readLine()), i});
        }


        int[] quiz = new int[5];
        int sum = 0;
        for(int i = 0; i<5; i++) {
            int[] arr = heap.poll();
            sum += arr[0];
            quiz[i] = arr[1];
        }
        Arrays.sort(quiz);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<5; i++) {
            sb.append(quiz[i]).append(" ");
        }
        System.out.println(sum);
        System.out.println(sb);

    }
}
