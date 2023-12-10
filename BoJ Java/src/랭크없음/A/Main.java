package 랭크없음.A;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int state = 1; // N E S W
        for (int i = 0; i < 10; i++) {
            int order = Integer.parseInt(br.readLine());

            if (order == 1) {
                state += 1;
            } else if (order == 2) {
                state += 2;
            } else {
                state -= 1;
            }

            if (state <= 0) {
                state = 4;
            } else if (state > 4) {
                state -= 4;
            }
        }

        switch (state) {
            case 1:
                System.out.println("N");
                break;
            case 2:
                System.out.println("E");
                break;
            case 3:
                System.out.println("S");
                break;
            case 4:
                System.out.println("W");
                break;
        }
    }
}
