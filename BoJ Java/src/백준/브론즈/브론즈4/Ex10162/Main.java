package 백준.브론즈.브론즈4.Ex10162;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int A, B, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        if(t % 10 != 0) {
            System.out.println(-1);
            return;
        }

        if (t >= 5 * 60) {
            A = t / (5 * 60);
            t = t % (5 * 60);
        }

        if (t >= 60) {
            B = t / 60;
            t = t % 60;
        }

        if (t >= 10) {
            C = t / 10;
        }

        System.out.println(A + " " + B + " " + C);
    }
}
