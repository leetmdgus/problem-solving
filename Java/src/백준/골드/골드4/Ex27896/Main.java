package 백준.골드.골드4.Ex27896;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int totalDissatisfaction = 0;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int dissatisfaction = Integer.parseInt(st.nextToken());
            totalDissatisfaction += dissatisfaction;
            pq.add(dissatisfaction);

            if (totalDissatisfaction >= M) {
                totalDissatisfaction -= (pq.poll() * 2);
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
