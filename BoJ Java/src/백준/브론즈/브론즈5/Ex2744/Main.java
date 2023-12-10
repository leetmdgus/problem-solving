package 백준.브론즈.브론즈5.Ex2744;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<word.length(); i++) {
            char c = word.charAt(i);

            if(c >= 'a' && c <= 'z') {
                c -= 'a' - 'A';
            } else {
                c += 'a' - 'A';
            }

            sb.append(c);
        }

        System.out.println(sb);
    }
}