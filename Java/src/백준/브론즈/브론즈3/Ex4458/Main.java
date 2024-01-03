package 백준.브론즈.브론즈3.Ex4458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            sb.append(String.valueOf(str.charAt(0)).toUpperCase());
            sb.append(str.substring(1));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
