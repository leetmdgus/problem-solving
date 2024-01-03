package 백준.실버.실버4.Ex28279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Deque deque = new LinkedList();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num  =Integer.parseInt(st.nextToken());
            switch (num) {
                case 1:
                    deque.addFirst(st.nextToken());
                    break;
                case 2:
                    deque.addLast(st.nextToken());
                    break;
                case 3:
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.removeFirst()).append('\n');
                    }
                    break;
                case 4:
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.removeLast()).append('\n');
                    }
                    break;
                case 5:
                    sb.append(deque.size()).append('\n');
                    break;
                case 6:
                    sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 7:
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.getFirst()).append('\n');
                    }
                    break;
                case 8:
                    if(deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(deque.getLast()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
