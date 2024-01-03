package 백준.골드.골드5.Ex1107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Set<Integer> brokenButton = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        if(m > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                int n = Integer.parseInt(st.nextToken());
                brokenButton.add(n);
            }
        }

        int result = Math.abs(target - 100);
        for (int i = 0; i <= 999999; i++) {
            int len = String.valueOf(i).length();

            if (!containBrokenButton(i)) {
                int min = Math.abs(target - i) + len;
                result = Math.min(min, result);
            }
        }
        System.out.println(result);
    }

    public static boolean containBrokenButton(int num) {
        String str = String.valueOf(num);

        for (int i = 0; i < str.length(); i++) {
            if (brokenButton.contains(str.charAt(i) - '0')) {
                return true;
            }
        }
        return false;
    }
}
