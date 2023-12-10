package 백준.브론즈.브론즈3.Ex10817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] abc = new int[3];
        for(int i = 0; i<3; i++) {
            abc[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(abc);

        System.out.println(abc[1]);
    }
}
