package 백준.실버.실버5.Ex2536;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Score> pq = new PriorityQueue<>((o1, o2) -> o2.score - o1.score);

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            pq.add(new Score(st.nextToken(), st.nextToken(), st.nextToken()));
        }

        int[] countryMedal = new int[101];
        int cnt = 0;

        while (!pq.isEmpty() && cnt < 3) {
                Score s = pq.poll();
            if (countryMedal[s.country] >= 2) {
                continue;
            }
            countryMedal[s.country]++;
            cnt++;
            System.out.println(s.country + " " + s.number);
        }
    }

    static class Score {
        int country;
        int number;
        int score;

        public Score(String country, String number, String score) {
            this.country = Integer.parseInt(country);
            this.number = Integer.parseInt(number);
            this.score = Integer.parseInt(score);
        }
    }
}
