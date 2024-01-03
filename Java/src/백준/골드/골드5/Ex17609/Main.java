package 백준.골드.골드5.Ex17609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int palindrome(String word) {
        int p1 = 0;
        int p2 = word.length() - 1;
        boolean isPalindrome = true;

        while (p1 < p2) {
            if (word.charAt(p1) == word.charAt(p2)) {
                p1++;
                p2--;
                continue;
            }

            if (!isPalindrome) {
                return 2;
            }
            isPalindrome = false;

            if (word.charAt(p1) == word.charAt(p2 - 1)) {
                p2--;
            } else if (word.charAt(p1 + 1) == word.charAt(p2)) {
                p1++;
            }
        }

        return isPalindrome ? 0 : 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringBuilder word = new StringBuilder(br.readLine());
            if (palindrome(word.toString()) == 2) {
                sb.append(palindrome(word.reverse().toString()) == 1 ? 1 : 2).append("\n");
            } else {
                sb.append(palindrome(word.toString())).append("\n");
            }
        }

        System.out.println(sb);
    }
}
