package 백준.브론즈.브론즈4.Ex15873;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        if (n % 100 == 10) {
            sum = n / 100 + 10;
        } else {
            sum = n / 10 + n % 10;
        }
        System.out.print(sum);
    }
}
