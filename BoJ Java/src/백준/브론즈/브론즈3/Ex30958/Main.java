package 백준.브론즈.브론즈3.Ex30958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int max = 0;
        int[] arr = new int['z' - 'a' + 1];
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i)-'a';
            if(c <='z'-'a' && c >= 0) {
                arr[c]++;
                max = Math.max(max, arr[c]);
            }
        }
        System.out.println(max);
    }
}
