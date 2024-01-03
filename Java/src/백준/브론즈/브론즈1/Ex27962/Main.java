package 백준.브론즈.브론즈1.Ex27962;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        StringBuilder start = new StringBuilder();
        StringBuilder end = new StringBuilder();

        for (int i = 0; i < n; i++) {
            start.append(str.charAt(i));
            end.reverse();
            end.append(str.charAt(n - i - 1));
            end.reverse();
            if (isVitamin(start.toString(), end.toString())) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }

    public static boolean isVitamin(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int length = str1.length();

        int diff = 0;
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diff++;
            }
        }

        return diff == 1;
    }
}
