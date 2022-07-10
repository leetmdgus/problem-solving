package 번호2445;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            for(int j = i+1; j<2*n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j = 2*n-i; j<2*n+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =0; i<n; i++) {
            for(int j = i; j < n-1; j++) {
                System.out.print("*");
            }
            for(int j = 2*n-2; j<2*(n+i); j++) {
                System.out.print(" ");
            }
            for(int j = i; j < n-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
