package 백준.브론즈.브론즈5.Ex27294;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());
        boolean drink = Integer.parseInt(st.nextToken()) == 1;

        System.out.println(isLunchTime(time) && !drink ? 320 : 280);
    }

    public static boolean isLunchTime(int t) {
        return t >= 12 && t <= 16;
    }
}
