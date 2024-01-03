package 백준.브론즈.브론즈1.Ex24416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 0;
    static int fibonacci(int n) {
        if (n == 1) {
            count++;
            return 1;
        } else if(n == 2) {
            count++;
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibonacci(n);
        System.out.println(count + " " + (n-2));

    }
}
