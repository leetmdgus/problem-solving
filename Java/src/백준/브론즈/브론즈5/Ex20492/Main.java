package 백준.브론즈.브론즈5.Ex20492;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int case1 = (int) (n * 0.78);
        int case2 = (int) (n * 0.80) + (int) (n * 0.20 * 0.78);

        System.out.println(case1 + " " + case2);

    }
}
