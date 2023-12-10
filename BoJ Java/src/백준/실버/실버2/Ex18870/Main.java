package 백준.실버.실버2.Ex18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            heap.add(new int[]{Integer.parseInt(st.nextToken()), i});
        }

        int[] answer = new int[n];
        int prevNum = 0;
        int rank = -1;
        for(int i = 0; i<n; i++) {
            int[] arr = heap.poll();
            if(prevNum != arr[0]) {
                rank++;
            }
            answer[arr[1]] = rank;
            prevNum = arr[0];
        }

        StringBuilder sb= new StringBuilder();
        for(int i =0; i<n; i++) {
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}
