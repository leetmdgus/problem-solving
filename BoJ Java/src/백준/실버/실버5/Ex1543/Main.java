package 백준.실버.실버5.Ex1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String word = br.readLine();

        int cnt = 0;
        while(str.contains(word)) {
            cnt++;
            str = str.replaceFirst(word,"\n");
        }
        System.out.println(cnt);
    }
}
