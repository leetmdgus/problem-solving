package 브론즈2.Ex3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] remainArr = new int[42];

        int inputCount = 10;
        while (inputCount-- > 0) {
            int num = Integer.parseInt(br.readLine());
            int remain = num % 42;
            if(remainArr[remain] == 0) {
                remainArr[remain]++;

            }
        }

        int count = 0;
        for(int remain:remainArr) {
            if(remain == 1) {
                count++;
            }
        }

        System.out.println(count);

    }
}
