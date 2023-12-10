package 백준.브론즈.브론즈5.Ex27866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static String S;
    static int i;

    public static void main(String[] args) throws IOException {
        input();
        find();
        System.out.println(sb);
    }

    public static void input() throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        i = Integer.parseInt(br.readLine());
    }

    public static void find() {
        sb.append(S.charAt(i-1));
    }
}