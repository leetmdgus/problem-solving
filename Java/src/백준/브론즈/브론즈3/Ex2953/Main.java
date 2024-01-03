package 백준.브론즈.브론즈3.Ex2953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int[] scoreArray = new int[6];

        int winner = 0;
        int score = 0;

        for(int i = 1; i<=5;i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<4;j ++) {
                scoreArray[i] += Integer.parseInt(st.nextToken());
            }
            if(scoreArray[i] >score) {
                winner = i;
                score = scoreArray[i];
            }
        }

        System.out.println(winner+ " " + score);
    }
}
