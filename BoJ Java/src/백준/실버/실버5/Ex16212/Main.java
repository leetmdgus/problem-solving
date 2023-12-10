package 백준.실버.실버5.Ex16212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        PriorityQueue<BigInteger> heap = new PriorityQueue<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n ;i++) {
            heap.add(new BigInteger(st.nextToken()));
        }

        StringBuilder sb= new StringBuilder();
        while(!heap.isEmpty()) {
            sb.append(heap.poll()).append(" ");
        }
        System.out.println(sb);
    }
}
