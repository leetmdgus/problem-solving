package 백준.브론즈.브론즈4.Ex30868;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int five = n / 5;
            int vote = n % 5;
            for(int i= 0; i<five; i++) {
                System.out.print("++++ ");
            }
            for(int i = 0; i<vote; i++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
