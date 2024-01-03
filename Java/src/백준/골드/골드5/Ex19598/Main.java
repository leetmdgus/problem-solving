package 백준.골드.골드5.Ex19598;

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
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            lectureArrayList.add(new Lecture(start, end));
        }

        Collections.sort(lectureArrayList, Comparator.comparingLong(o -> o.start));
        PriorityQueue<Lecture> lecturePriorityQueue = new PriorityQueue<>(Comparator.comparingLong(o->o.end));

        lecturePriorityQueue.add(lectureArrayList.get(0));
        for(int i = 1; i<n; i++) {
            long start = lectureArrayList.get(i).start;
            long end = lecturePriorityQueue.peek().end;

            if(start >= end) {
                lecturePriorityQueue.remove();
            }

            lecturePriorityQueue.add(lectureArrayList.get(i));
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
