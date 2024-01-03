package 백준.브론즈.브론즈4.Ex31090;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if ((n + 1) % (n - n / 100 * 100) == 0) {
                System.out.println("Good");
            } else {
                System.out.println("Bye");
            }
        }
    }
}
