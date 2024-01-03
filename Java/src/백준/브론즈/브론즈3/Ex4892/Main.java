package 백준.브론즈.브론즈3.Ex4892;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        for (int i = 1; ; i++) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0) break;

            sb.append(i+". ");
            sb.append(n%2 == 0 ? "even " + n/2 : "odd " + n/2);
            sb.append('\n');
        }

        System.out.println(sb);

    }
}
