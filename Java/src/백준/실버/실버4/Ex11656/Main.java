package 백준.실버.실버4.Ex11656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] strArr = new String[s.length()];
        for(int i = 0; i< strArr.length; i++) {
            strArr[i] = s.substring(i);
        }

        Arrays.sort(strArr);

        StringBuilder sb= new StringBuilder();
        for(int i = 0; i< strArr.length; i++) {
            sb.append(strArr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
