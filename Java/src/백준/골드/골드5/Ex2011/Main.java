package 백준.골드.골드5.Ex2011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (str.length() == 1) {
            if (str.equals("0")) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
            return;
        }

        int[] dp = new int[str.length() + 1];
        dp[1] = 1;
        if (Integer.parseInt("" + str.charAt(0) + str.charAt(1)) <= 26) {
            dp[2] = 2;
        } else {
            dp[2] = 1;
        }


        for (int i = 3; i < str.length(); i++) {
            int prev = str.charAt(i - 2) - '0';
            int now = str.charAt(i - 1) - '0';
            if (Integer.parseInt("" + prev + now) <= 26) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 1_000_000;
            } else {
                dp[i] = dp[i - 1];
            }
        }

        int prev = str.charAt(str.length() - 2) - '0';
        int now = str.charAt(str.length() - 1) - '0';

        if (now == 0) {
            if (prev >= 3) {
                System.out.println(0);
                return;
            } else {
                dp[str.length()] = (dp[str.length() - 1] + dp[str.length() - 2]) % 1_000_000;
            }
        } else {
            if (Integer.parseInt("" + prev + now) <= 26) {
                dp[str.length()] = (dp[str.length() - 1] + dp[str.length() - 2]) % 1_000_000;
            } else {
                dp[str.length()] = dp[str.length() - 1];
            }
        }


        System.out.println(dp[str.length()] % 1_000_000);
    }
}
