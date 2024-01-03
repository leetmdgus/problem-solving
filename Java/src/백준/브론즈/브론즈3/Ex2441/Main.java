package 백준.브론즈.브론즈3.Ex2441;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder star = new StringBuilder("*");

        for(int i = 0; i<n; i++) {
            star.append("*");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(star).append('\n');
            star.replace(i, i+1, " ");
        }
        System.out.println(sb);
    }
}
