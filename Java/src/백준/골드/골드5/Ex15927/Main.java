package 백준.골드.골드5.Ex15927;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        boolean flag = true;
        char prev = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != prev) {
                flag = false;
            }
        }
        if(flag) {
            System.out.println(-1);
            return;
        }

        if(isPalindrome(str)) {
            System.out.println(str.length()-1);
        } else {
            System.out.println(str.length());
        }

    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length()  - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
