package 백준.브론즈.브론즈2.Ex1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        if( B >= C ) {
            System.out.println(-1);
            return;
        }

        long produce = 0;
        long income = produce * C;
        long outcome = A + B * produce;

        while(income <= outcome) {
            produce++;
            income = produce * C;
            outcome = A + B * produce;
        }

        System.out.println(produce);
    }
}
