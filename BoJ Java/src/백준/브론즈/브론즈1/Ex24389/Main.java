package 백준.브론즈.브론즈1.Ex24389;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        int outputNum = ~inputNum + 1;

        int sameBitNum = inputNum ^ outputNum;
        int count = 0;
        for(char c : Integer.toBinaryString(sameBitNum).toCharArray()) {
            if(c == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
