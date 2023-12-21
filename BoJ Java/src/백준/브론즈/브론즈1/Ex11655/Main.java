package 백준.브론즈.브론즈1.Ex11655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                c = (char) (str.charAt(i) + 13 > 'Z' ? str.charAt(i) + 13 - 'Z' + 'A' - 1 : str.charAt(i) + 13);
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                c = (char) (str.charAt(i) + 13 > 'z' ? str.charAt(i) + 13 - 'z' + 'a' - 1 : str.charAt(i) + 13);
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}
