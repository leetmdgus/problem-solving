package 백준.브론즈.브론즈3.Ex10886;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int agree = 0;
        int disagree = 0;

        for(int i= 0; i<n; i++) {
            int vote = Integer.parseInt(br.readLine());
            if(vote == 1) {
                agree++;
            } else {
                disagree++;
            }
        }

        if(agree > disagree) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }

    }
}
