package 백준.브론즈.브론즈2.Ex10953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(t-- > 0) {
            String[] word = br.readLine().split(",");
            int sum = Integer.parseInt(word[0]) + Integer.parseInt(word[1]);
            sb.append(sum+"\n");
        }

        System.out.println(sb);
    }
}
