package 백준.브론즈.브론즈5.Ex20254;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int uR = Integer.parseInt(st.nextToken());
        int tR = Integer.parseInt(st.nextToken());
        int uO = Integer.parseInt(st.nextToken());
        int tO = Integer.parseInt(st.nextToken());

        System.out.println((56 * uR) + (24 * tR) + (14 * uO) + (6 * tO));
    }
}
