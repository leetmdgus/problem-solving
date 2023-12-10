package 백준.브론즈.브론즈3.Ex10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());


            int dong = 0;
            int ho = 1;
            for(int i = 0; i<n ;i++) {
                dong++;
                if(dong > h) {
                    dong = 1;
                    ho++;
                }
            }

            String room = String.valueOf(dong) + (ho/10 == 0? "0"+ ho : ho);
            sb.append(room).append('\n');
        }

        System.out.println(sb);
    }
}
