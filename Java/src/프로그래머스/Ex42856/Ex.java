package 프로그래머스.Ex42856;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Ex {
    public static void main(String[] args) {
        int[] answer = {};
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));

        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        PriorityQueue<int[]> queue2 = new PriorityQueue<>((o1, o2) -> o1[0]-o2[0]);

        answer = heap.poll();
    }
}
