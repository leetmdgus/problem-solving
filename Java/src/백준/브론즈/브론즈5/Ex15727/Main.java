package 백준.브론즈.브론즈5.Ex15727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        System.out.println(l % 5 == 0 ? l / 5 : l / 5 + 1);

    }
}
