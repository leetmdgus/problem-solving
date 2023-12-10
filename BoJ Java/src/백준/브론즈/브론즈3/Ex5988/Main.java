package 백준.브론즈.브론즈3.Ex5988;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String str = br.readLine();

            int num = str.charAt(str.length() - 1) - '0';
            sb.append(num % 2 == 0 ? "even\n" : "odd\n");

        }
        System.out.println(sb);
    }
}
