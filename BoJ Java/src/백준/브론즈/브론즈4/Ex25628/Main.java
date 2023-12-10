package 백준.브론즈.브론즈4.Ex25628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bread = Integer.parseInt(st.nextToken());
        int meat = Integer.parseInt(st.nextToken());

        int burger = Math.min(bread/2 , meat);
        System.out.println(burger);
    }
}
