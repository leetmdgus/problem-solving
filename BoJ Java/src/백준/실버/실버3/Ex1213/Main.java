package 백준.실버.실버3.Ex1213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = new char['z' - 'a' + 1];

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            arr[c - 'A']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] >= 2) {
                sb.append((char) (i + 'A'));
                arr[i] -= 2;
            }
        }

        boolean oneFlag = false;
        for (int i = 0; i < arr.length; i++) {
            if (oneFlag && arr[i] == 1) {
                System.out.println("I'm Sorry Hansoo");
                return;
            }
            if (arr[i] == 1) {
                oneFlag = true;
                sb.append((char) (i + 'A'));
            }
        }

        if (oneFlag) {
            String reverse = new StringBuilder(sb.substring(0, sb.length() - 1)).reverse().toString();
            sb.append(reverse);
        } else {
            String reverse = new StringBuilder(sb).reverse().toString();
            sb.append(reverse);
        }

        System.out.println(sb);
    }
}
