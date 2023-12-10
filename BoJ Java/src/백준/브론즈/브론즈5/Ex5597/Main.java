package 백준.브론즈.브론즈5.Ex5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isCheck = new boolean[31];
        for(int i = 1; i<=28; i++) {
            isCheck[Integer.parseInt(br.readLine())] = true;
        }

        StringBuilder sb= new StringBuilder();
        for(int i = 1; i<=30; i++) {
            if(!isCheck[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
