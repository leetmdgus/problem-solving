package 백준.브론즈.브론즈5.Ex5613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long ans = Integer.parseInt(br.readLine());
        String operations = null;
        while (true) {
            String str = br.readLine();
            if(str.equals("=")) break;

            if (operations != null) {
                ans = calculation(ans, Integer.parseInt(str), operations);
                operations = null;
            } else {
                operations = str;
            }
        }
        System.out.println(ans);
    }

    public static long calculation(long a, long b, String oper) {
        if (oper.equals("+")) {
            return a + b;
        } else if (oper.equals("-")) {
            return a - b;
        } else if (oper.equals("*")) {
            return a * b;
        } else if (oper.equals("/")) {
            return a / b;
        }
        return -1;
    }
}
