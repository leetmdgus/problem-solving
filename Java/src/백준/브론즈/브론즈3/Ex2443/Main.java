package 백준.브론즈.브론즈3.Ex2443;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < i; j++) sb.append(' ');
            for (int j = i; j < 2 * n -1- i; j++) sb.append('*');
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
