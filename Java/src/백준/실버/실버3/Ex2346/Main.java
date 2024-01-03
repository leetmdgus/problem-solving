package 백준.실버.실버3.Ex2346;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            deque.add(new int[]{Integer.parseInt(st.nextToken()), i});
        }

        StringBuilder sb = new StringBuilder();

        int[] current = deque.removeFirst();
        sb.append(current[1]).append(' ');

        while (!deque.isEmpty()) {
            if (current[0] > 0) {
                for (int i = 1; i < current[0]; i++) {
                    deque.addLast(deque.removeFirst());
                }
                current = deque.removeFirst();
            } else {
                for (int i = 1; i < Math.abs(current[0]); i++) {
                    deque.addFirst(deque.removeLast());
                }
                current = deque.removeLast();
            }
            sb.append(current[1]).append(' ');


        }

        System.out.println(sb);

    }
}
