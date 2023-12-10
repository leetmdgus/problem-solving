package 백준.브론즈.브론즈5.Ex11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while(true) {
            String word = br.readLine();
            if(word == null) {
                break;
            }

            sb.append(word).append("\n");
        }

        System.out.println(sb);
    }
}
