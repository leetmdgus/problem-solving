package 백준.브론즈.브론즈5.Ex2754;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String achievement = br.readLine();
        if(achievement.equals("F")) {
            System.out.println(0.0);
            return;
        }


        char a = achievement.charAt(0);
        char b = achievement.charAt(1);

        double score = 0.0;
        if(a == 'A') {
            score = 4;
        } else if(a == 'B') {
            score = 3;
        } else if(a == 'C') {
            score = 2;
        } else if(a == 'D') {
            score = 1;
        }

        if(b == '+') {
            score += 0.3;
        } else if(b == '-') {
            score -= 0.3;
        }

        System.out.println(score);
    }
}
