package 백준.브론즈.브론즈4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String numStr = br.readLine();
        char[] numArr = numStr.toCharArray();

        int sum = 0;
        for(char num: numArr) {
            sum += num - '0';
        }
        System.out.println(sum);

    }
}
