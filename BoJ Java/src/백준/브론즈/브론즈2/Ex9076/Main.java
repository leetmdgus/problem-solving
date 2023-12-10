package 백준.브론즈.브론즈2.Ex9076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] nArr =new int[5];
            for(int i = 0; i<5; i++) {
                nArr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nArr);

            if(nArr[3] - nArr[1] >= 4) {
                sb.append("KIN").append("\n");
            } else {
                sb.append(nArr[1] + nArr[2] + nArr[3]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
