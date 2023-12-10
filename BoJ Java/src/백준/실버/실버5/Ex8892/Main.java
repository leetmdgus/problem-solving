package 백준.실버.실버5.Ex8892;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }

            String ans = "0";
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && isPalindrome(arr[i], arr[j])) {
                        ans = arr[i] + arr[j];
                    }
                }
            }
            sb.append(ans).append('\n');
        }
        System.out.println(sb);
    }

    public static boolean isPalindrome(String str1, String str2) {
        String str = str1 + str2;
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
