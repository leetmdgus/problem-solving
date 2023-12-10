package 백준.브론즈.브론즈1.번호1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectCount = Integer.parseInt(br.readLine());
        String[] scores = br.readLine().split(" ");

        int max = 0;
        for(String score : scores) {
            int point = Integer.parseInt(score);
            if(point > max) {
                max = point;
           }
        }
        float[] transScores = new float[scores.length];

        for(int i = 0; i<scores.length; i++) {
            float score = Float.parseFloat(scores[i]);
            transScores[i] = score/max * 100;
        }

        float sum = 0;

        for(int i = 0; i<transScores.length; i++) {
            sum += transScores[i];
        }
        float aver = sum / transScores.length;
        System.out.println(aver);
    }
}
