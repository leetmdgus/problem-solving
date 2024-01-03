package 백준.브론즈.브론즈5.Ex9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb =new StringBuilder();
        while(n-- > 0) {
            String str = br.readLine();
            sb.append(str.charAt(0)).append(str.charAt(str.length()-1));
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
