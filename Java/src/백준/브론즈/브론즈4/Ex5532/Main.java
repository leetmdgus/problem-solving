package 백준.브론즈.브론즈4.Ex5532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int korean = a%c == 0 ? a/c : a/c+1;
        int math = b%d == 0 ? b/d : b/d+1;

        int max = l - Math.max(korean, math);

        System.out.println(max);
    }
}
