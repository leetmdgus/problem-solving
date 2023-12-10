package 백준.브론즈.브론즈3.Ex4504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (true) {
            int multi = Integer.parseInt(br.readLine());
            if (multi == 0) {
                break;
            }

            if (multi % n != 0) {
                sb.append(multi + " is NOT a multiple of " + n + ".\n");
            } else {
                sb.append(multi + " is a multiple of " + n + ".\n");
            }
        }
        System.out.println(sb);
    }
}
