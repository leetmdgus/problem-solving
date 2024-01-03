package 백준.브론즈.브론즈3.Ex9085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        while(t -- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st= new StringTokenizer(br.readLine());
            int sum = 0;
            for(int i = 0; i<n; i++) {
                sum += Integer.parseInt(st.nextToken());
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
