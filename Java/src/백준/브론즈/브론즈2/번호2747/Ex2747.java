package 백준.브론즈.브론즈2.번호2747;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2747 {
    static int[] array = new int[46];
    private static int fibonacci(int n) {
        array[0] = 0;
        array[1] = 1;
        for(int i = 2; i <= n; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));

    }
}
