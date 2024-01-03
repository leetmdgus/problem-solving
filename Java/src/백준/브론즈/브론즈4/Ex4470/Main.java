package 백준.브론즈.브론즈4.Ex4470;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            sb.append(i + ". ").append(br.readLine()).append("\n");
        }
        System.out.println(sb);
    }
}
