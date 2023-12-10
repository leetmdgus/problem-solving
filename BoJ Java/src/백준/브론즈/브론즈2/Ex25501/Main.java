package 백준.브론즈.브론즈2.Ex25501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            cnt = 0;
            sb.append(isPalindrome(br.readLine()));
            sb.append(' ');
            sb.append(cnt).append('\n');
        }

        System.out.println(sb);
    }

    public static int isPalindrome(String s) {
        return recursion(s);
    }

    public static int recursion(String s) {
        cnt++;
        if (s.length() <= 1) return 1;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) return 0;
        else return recursion(s.substring(1, s.length() - 1));
    }
}
