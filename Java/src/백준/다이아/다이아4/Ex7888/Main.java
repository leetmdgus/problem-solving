package 백준.다이아.다이아4.Ex7888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            PriorityQueue<Lecture> pq = new PriorityQueue<>(Comparator.comparingLong(o -> o.end));
            Lecture[] lectures = new Lecture[n];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                long start = Long.parseLong(st.nextToken());
                long end = Long.parseLong(st.nextToken());
                if (i == 0) {
                    lectures[i] = new Lecture(i + 1, start, end, true, false);
                } else if (i == 1) {
                    lectures[i] = new Lecture(i + 1, start, end, false, true);
                } else {
                    lectures[i] = new Lecture(i + 1, start, end, false, false);
                }
            }

            Arrays.sort(lectures, Comparator.comparingLong(o -> o.start));
            pq.add(lectures[0]);

            for (int i = 1; i < n; i++) {
                Lecture now = pq.remove();
                if (now.oneFlag && lectures[i].twoFlag || now.twoFlag && lectures[i].oneFlag) {
                    pq.add(now);

                    if (pq.size() > 1) {
                        Lecture next = pq.remove();
                        pq.add(lectures[i]);

                        if (next.end > lectures[i].start) {
                            pq.add(next);
                        }
                    } else {
                        pq.add(lectures[i]);
                    }
                } else {
                    pq.add(lectures[i]);
                    if (now.end > lectures[i].start) {
                        pq.add(now);
                    }
                }
            }

            sb.append(pq.size()).append('\n');
        }

        System.out.println(sb);
    }

    static class Lecture {
        int idx;
        long start, end;
        boolean oneFlag, twoFlag;

        public Lecture(int idx, long start, long end, boolean flag1, boolean flag2) {
            this.idx = idx;
            this.start = start;
            this.end = end;
            this.oneFlag = flag1;
            this.twoFlag = flag2;
        }
    }
}
