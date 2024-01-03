package 백준.실버.실버4.Ex9656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int winner = n % 4;
        if(winner == 1 || winner == 3) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
