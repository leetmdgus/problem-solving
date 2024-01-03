package 백준.브론즈.브론즈4.Ex11948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A, B, C, D, E, F;
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        D = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());
        F = Integer.parseInt(br.readLine());

        int a = A + B + C + D - Math.min(A, Math.min(B, Math.min(C, D)));
        int b = E + F - Math.min(E, F);
        System.out.println(a + b);
    }
}
