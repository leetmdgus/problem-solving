package 백준.브론즈.브론즈4.Ex11365;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        while(true) {
            StringBuilder input = new StringBuilder(br.readLine());
            if(input.toString().equals("END")) break;

            sb.append(input.reverse()).append('\n');
        }
        System.out.println(sb);
    }
}
