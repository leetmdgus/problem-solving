package 백준.브론즈.브론즈3.Ex27736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int agree = 0;
        int disagree = 0;
        int abstention = 0;
        for (int i = 0; i < n; i++) {
            int opinion = Integer.parseInt(st.nextToken());
            if (opinion == 1) {
                agree++;
            } else if (opinion == -1) {
                disagree++;
            } else {
                abstention++;
            }
        }


        int mid = n % 2 == 0 ? n / 2 : n / 2 + 1;
        if (abstention >= mid) {
            System.out.println("INVALID");
        } else if (disagree >= agree) {
            System.out.println("REJECTED");
        } else {
            System.out.println("APPROVED");
        }
    }
}
