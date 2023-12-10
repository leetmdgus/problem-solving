package 백준.브론즈.브론즈4.Ex10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int['z'-'a'+1];

        for(int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            arr[c-'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);

    }
}
