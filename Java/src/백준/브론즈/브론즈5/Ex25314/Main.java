package 백준.브론즈.브론즈5.Ex25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb =new StringBuilder();

        int repeat = n/4;
        while(repeat -- > 0) {
            sb.append("long").append(" ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}
