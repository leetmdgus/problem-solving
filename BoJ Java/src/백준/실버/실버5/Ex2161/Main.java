package 백준.실버.실버5.Ex2161;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            int now = deque.removeFirst();
            sb.append(now).append(' ');

            if (!deque.isEmpty()) {
                int next = deque.removeFirst();
                deque.addLast(next);
            }
        }

        System.out.println(sb);
    }
}
