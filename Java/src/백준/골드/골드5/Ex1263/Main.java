package 백준.골드.골드5.Ex1263;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Time> q = new PriorityQueue<>((o1, o2) -> o2.s - o1.s);

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            q.add(new Time(t, s));
        }

        int currentTime = Integer.MAX_VALUE;
        while(!q.isEmpty()) {
            Time now = q.remove();
            if(currentTime > now.s) {
                currentTime = now.s;
            }
            currentTime -= now.t;
        }

        System.out.println(currentTime < 0 ? -1 : currentTime);
    }

    static class Time {
        int t, s;

        public Time(int t, int s) {
            this.t = t;
            this.s = s;
        }
    }
}
