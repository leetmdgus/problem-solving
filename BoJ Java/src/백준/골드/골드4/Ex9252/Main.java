package 백준.골드.골드4.Ex9252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int cnt = dp[str1.length()][str2.length()];
        System.out.println(cnt);

        StringBuilder sb = new StringBuilder();

        int idx1 = str1.length();
        int idx2 = str2.length();
        while (idx1 != 0 && idx2 != 0) {
            if (str1.charAt(idx1 - 1) == str2.charAt(idx2 - 1)) {
                sb.append(str1.charAt(idx1 - 1));
                idx1--;
                idx2--;
            } else if (dp[idx1][idx2] == dp[idx1 - 1][idx2]) {
                idx1--;
            } else if (dp[idx1][idx2] == dp[idx1][idx2 - 1]) {
                idx2--;
            }
        }
        System.out.println(sb.reverse());
    }
}
