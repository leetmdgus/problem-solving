package 백준.브론즈.브론즈3.Ex5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            if(num1 == 0 && num2 == 0) {
                break;
            }

            if(num1 % num2 == 0) {
                sb.append("multiple\n");
            } else if(num2 % num1 == 0){
                sb.append("factor\n");
            } else {
                sb.append("neither\n");
            }
        }

        System.out.println(sb);
    }
}
