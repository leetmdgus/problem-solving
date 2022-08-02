package 실버2.Ex11286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Ex11286 {

    static PriorityQueue<Integer> queuePlus = new PriorityQueue<>();
    static PriorityQueue<Integer> queueMinus = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (repeat-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (queuePlus.isEmpty() && queueMinus.isEmpty()) {
                    sb.append(0).append('\n');
                } else if (!queuePlus.isEmpty() && !queueMinus.isEmpty()) {
                    int minPlus = queuePlus.peek();
                    int minMinus = queueMinus.peek();

                    if (minPlus < minMinus) {
                        sb.append(queuePlus.poll()).append('\n');
                    } else {
                        sb.append('-').append(queueMinus.poll()).append('\n');
                    }
                } else if (!queuePlus.isEmpty()) {
                    sb.append(queuePlus.poll()).append('\n');
                } else if(!queueMinus.isEmpty()) {
                    sb.append('-').append(queueMinus.poll()).append('\n');
                }
            } else if (num < 0) {
                queueMinus.offer(-num);
            } else if (num > 0) {
                queuePlus.offer(num);
            }
        }

        System.out.println(sb);
    }
}
