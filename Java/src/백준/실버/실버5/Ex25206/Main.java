package 백준.실버.실버5.Ex25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static Map<String, Double> SCORE = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init();

        int n = 20;
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String major = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String rank = st.nextToken();

            if (!rank.equals("P")) {
                sum1 += credit * SCORE.get(rank);
                sum2 += credit;
            }
        }
        System.out.println(sum1 / sum2);
    }

    public static void init() {
        SCORE.put("A+", 4.5);
        SCORE.put("A0", 4.0);
        SCORE.put("B+", 3.5);
        SCORE.put("B0", 3.0);
        SCORE.put("C+", 2.5);
        SCORE.put("C0", 2.0);
        SCORE.put("D+", 1.5);
        SCORE.put("D0", 1.0);
        SCORE.put("F", 0.0);
    }

}
