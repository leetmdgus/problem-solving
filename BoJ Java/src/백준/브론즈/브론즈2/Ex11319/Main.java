package 백준.브론즈.브론즈2.Ex11319;

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
            str = str.replace(" ", "");
            String str2 = str.replaceAll("[AEIOUaeiou]", "");
            sb.append(str2.length() + " " + (str.length() - str2.length())).append('\n');
        }

        System.out.println(sb);
    }
}
