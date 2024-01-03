package 백준.브론즈.브론즈4.Ex2530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int d = Integer.parseInt(br.readLine());

        s += d % 60;
        m += d / 60;

        while(s >= 60) {
            s -= 60;
            m++;
        }

        while(m >= 60) {
            m-= 60;
            h++;
        }

        while(h >= 24) {
            h-= 24;
        }

        System.out.println(h + " " + m + " " + s);
    }
}
