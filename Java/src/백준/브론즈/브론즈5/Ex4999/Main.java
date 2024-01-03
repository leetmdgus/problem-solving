package 백준.브론즈.브론즈5.Ex4999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String canSay = br.readLine();
        String docSay = br.readLine();

        System.out.println(canSay.length() >= docSay.length() ? "go" : "no");
    }
}
