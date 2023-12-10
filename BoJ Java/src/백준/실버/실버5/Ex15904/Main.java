package 백준.실버.실버5.Ex15904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String UCPC = "UCPC";
        String  str= br.readLine();

        int idx = 0;

        for (int i = 0; i < str.length(); i++) {
            if (idx == UCPC.length()) break;
            if (UCPC.charAt(idx) == str.charAt(i)) {
                idx++;
            }
        }
        if (idx == UCPC.length()) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
    }
}

