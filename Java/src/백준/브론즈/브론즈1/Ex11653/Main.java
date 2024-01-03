package 백준.브론즈.브론즈1.Ex11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i= 2; i<=n; i++) {
            while(n%i == 0) {
                sb.append(i+"\n");
                n /= i;
            }
        }
        System.out.println(sb);
    }
}

