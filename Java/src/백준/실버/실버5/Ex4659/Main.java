package 백준.실버.실버5.Ex4659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str.equals("end")) break;

            if (!isContainAEIOU(str)) {
                sb.append("<" + str + ">" + " is not acceptable.\n");
                continue;
            }

            boolean flag = true;
            int cnt = 1;
            for (int i = 1; i < str.length(); i++) {
                char prev = str.charAt(i - 1);
                char curr = str.charAt(i);

                if ((isAEIOU(prev) && isAEIOU(curr)) || (!isAEIOU(prev) && !isAEIOU(curr))) {
                    cnt++;
                } else {
                    cnt = 1;
                }

                if (cnt >= 3 || prev == curr && !(curr == 'e') && !(curr == 'o')) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                sb.append("<" + str + ">" + " is acceptable.\n");
            } else {
                sb.append("<" + str + ">" + " is not acceptable.\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean isContainAEIOU(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (isAEIOU(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAEIOU(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
