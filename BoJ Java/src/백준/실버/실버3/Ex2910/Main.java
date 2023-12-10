package 백준.실버.실버3.Ex2910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Long, Num> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            long message = Long.parseLong(st.nextToken());

            if (map.containsKey(message)) {
                map.get(message).cnt++;
            } else {
                map.put(message, new Num(i, 1, message));
            }
        }

        PriorityQueue<Num> pq = new PriorityQueue<>(new Comparator<Num>() {
            @Override
            public int compare(Num o1, Num o2) {
                if(o1.cnt == o2.cnt) {
                    return o1.idx - o2.idx;
                } return o2.cnt - o1.cnt;
            }
        });

        Iterator<Num> it = map.values().iterator();
        while(it.hasNext()) {
            pq.add(it.next());
        }

        StringBuilder sb= new StringBuilder();
        while(!pq.isEmpty()) {
            Num now = pq.poll();
            for(int i = 0; i<now.cnt; i++) {
                sb.append(now.value).append(' ');
            }
        }
        System.out.println(sb);
    }

    static class Num {
        int idx, cnt;
        long value;

        public Num(int idx, int cnt, long value) {
            this.idx = idx;
            this.cnt = cnt;
            this.value = value;
        }
    }
}
