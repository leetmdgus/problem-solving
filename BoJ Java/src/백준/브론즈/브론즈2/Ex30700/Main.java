package 백준.브론즈.브론즈2.Ex30700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            if (length % 5 == 0 && str.charAt(i) == 'K') {
                length++;
            } else if (length % 5 == 1 && str.charAt(i) == 'O') {
                length++;
            } else if (length % 5 == 2 && str.charAt(i) == 'R') {
                length++;
            } else if (length % 5 ==3 && str.charAt(i) == 'E'){
                length++;
            } else if (length % 5 == 4 && str.charAt(i) == 'A') {
                length++;
            }
        }

        System.out.println(length);
    }
}
