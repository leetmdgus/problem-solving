package 백준.골드.골드5.Ex12904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder(br.readLine());
        StringBuilder t = new StringBuilder(br.readLine());

        while (t.length() > 0) {
            if (s.toString().equals(t.toString())) {
                System.out.println(1);
                return;
            }

            if (t.charAt(t.length() - 1) == 'B') {
                t.deleteCharAt(t.length()-1);
                t.reverse();
            } else {
                t.deleteCharAt(t.length()-1);
            }
        }

        System.out.println(0);
    }
}
