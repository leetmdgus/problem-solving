package 백준.브론즈.브론즈4.Ex14489;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(br.readLine());

        if (A + B >= 2 * C) {
            System.out.println(A + B - 2 * C);
        } else {
            System.out.println(A + B);
        }
    }
}
