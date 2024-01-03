package 백준.실버.실버5.Ex10709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < n; i++) {
            int sec = -1;
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if(str.charAt(j) == 'c') {
                    sec = 0;
                } else if(sec != -1){
                    sec++;
                }
                sb.append(sec).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);

    }
}
