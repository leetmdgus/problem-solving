package 백준.브론즈.브론즈3.Ex1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int a = Math.min(Math.abs(x - w), Math.abs(x));
        int b = Math.min(Math.abs(y - h), Math.abs(y));

        System.out.println(Math.min(a, b));
    }
}
