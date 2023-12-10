package 백준.브론즈.브론즈3.Ex28417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int score = 0;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer[] arr1 = new Integer[2];
            Integer[] arr2 = new Integer[5];
            for (int i = 0; i < 2; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < 5; i++) {
                arr2[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr1, Comparator.reverseOrder());
            Arrays.sort(arr2, Comparator.reverseOrder());

            int top3 = arr1[0] + arr2[0] + arr2[1];
            score = Math.max(score, top3);
        }
        System.out.println(score);
    }
}
