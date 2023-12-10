package 백준.브론즈.브론즈4.Ex11945;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb= new StringBuilder();
        for(int i = 0; i<n; i++) {
            sb.append(new StringBuilder(br.readLine()).reverse()).append('\n');
        }
        System.out.println(sb);
    }
}
