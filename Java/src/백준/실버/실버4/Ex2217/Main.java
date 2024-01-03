package 백준.실버.실버4.Ex2217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] rope = new int[n];
        for(int i = 0; i<rope.length; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope);

        int max = rope[0] * n;
        for(int i = n; i > 0; i--) {
            max = Math.max(rope[n-i] * i, max);
        }
        System.out.println(max);
    }
}
