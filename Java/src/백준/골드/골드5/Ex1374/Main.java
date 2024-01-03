package 백준.골드.골드5.Ex1374;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Lecture> lectureArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            long start = Long.parseLong(st.nextToken());
            long end = Long.parseLong(st.nextToken());

            lectureArrayList.add(new Lecture(start, end));
        }

        Collections.sort(lectureArrayList, Comparator.comparingLong(o -> o.start));
        PriorityQueue<Lecture> lecturePriorityQueue = new PriorityQueue<>(Comparator.comparingLong(o -> o.end));

        lecturePriorityQueue.add(lectureArrayList.get(0));
        for (int i = 1; i < n; i++) {
            Lecture nowPq = lecturePriorityQueue.peek();
            Lecture nowArr = lectureArrayList.get(i);

            if (nowPq.end <= nowArr.start) {
                lecturePriorityQueue.remove();
            }
            lecturePriorityQueue.add(nowArr);
        }

        System.out.println(lecturePriorityQueue.size());

    }

    static class Lecture {
        long start, end;

        public Lecture(long start, long end) {
            this.start = start;
            this.end = end;
        }
    }
}
