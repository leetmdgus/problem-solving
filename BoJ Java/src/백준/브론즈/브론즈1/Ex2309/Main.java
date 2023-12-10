package 백준.브론즈.브론즈1.Ex2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] heights = new int[9];
        int sum = 0;
        for(int i = 0; i<9; i++) {
            int n = Integer.parseInt(br.readLine());
            heights[i] = n;
            sum += n;
        }
        Arrays.sort(heights);

        int n1 = 0;
        int n2 = 0;
        for(int i = 0; i<9; i++) {
            for(int j = i+1; j<9; j++) {
                int s = sum;
                s -= heights[i];
                s -= heights[j];
                if(s == 100) {
                    n1 = i;
                    n2 = j;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<9; i++) {
            if(i != n1 && i != n2) {
                sb.append(heights[i]).append('\n');
            }
        }

        System.out.println(sb);

    }
}
