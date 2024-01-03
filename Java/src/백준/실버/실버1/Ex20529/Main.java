package 백준.실버.실버1.Ex20529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = st.nextToken();
            }

            int sum = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                int a, b, c;
                if (i == n - 1) {
                    a = distance(arr[i], arr[0]);
                    b = distance(arr[0], arr[1]);
                    c = distance(arr[1], arr[i]);
                } else if (i == n - 2) {
                    a = distance(arr[i], arr[i + 1]);
                    b = distance(arr[i + 1], arr[0]);
                    c = distance(arr[0], arr[i]);
                } else {
                    a = distance(arr[i], arr[i + 1]);
                    b = distance(arr[i + 1], arr[i + 2]);
                    c = distance(arr[i + 2], arr[i]);
                }

                sum = Math.min(sum, a + b + c);
            }
            sb.append(sum).append('\n');

        }

        System.out.println(sb);
    }

    public static int distance(String mbti1, String mbti2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            set1.add(mbti1.charAt(i));
            set2.add(mbti2.charAt(i));
        }

        set1.removeAll(set2);

        return set1.size();
    }
}
