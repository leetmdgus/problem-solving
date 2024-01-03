package 백준.브론즈.브론즈5.Ex10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i<n ;i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}
