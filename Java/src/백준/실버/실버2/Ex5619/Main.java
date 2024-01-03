package 백준.실버.실버2.Ex5619;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    static long N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());

        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return compareTe(o1, o2);
            }
        });

        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            if (pq.size() <= 3) {
                pq.add(a);
                continue;
            }
            if (compareTe(a, pq.peek()) == 1) {
                pq.poll();
                pq.add(a);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(i == j) continue;

                pq2.add(Integer.parseInt(list.get(i) + list.get(j)));
            }
        }

        pq2.poll();
        pq2.poll();
        System.out.println(pq2.poll());
    }

    public static int compareTe(String o1, String o2) { //o1 < o2 (오름차순)라면 1 아니라면 -1 둘이 같다면 0 리턴
        if (o1.equals(o2)) return 0; // 둘이 같다면 0 리턴

        if (o1.length() == o2.length()) {
            int length = o1.length();
            for (int i = 0; i < length; i++) {
                if (o1.charAt(i) - '0' == o2.charAt(i) - '0') continue;
                if (o1.charAt(i) - '0' < o2.charAt(i) - '0') {
                    return 1;
                } else return -1;
            }
        }
        return (o1.length() - o2.length() < 0 ? 1 : -1);
    }
}
