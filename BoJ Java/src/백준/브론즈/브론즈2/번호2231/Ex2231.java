package 백준.브론즈.브론즈2.번호2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2231 {
    static int decomposeCalculator(String constructor){
        char[] numArr = constructor.toCharArray();
        int decompose = Integer.parseInt(constructor);

        for(char num: numArr) {
            decompose += num - '0';
        }
        return decompose;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long inputNum = Integer.parseInt(br.readLine());
        long constructor = 0;

        for(long i = 0; i<1_000_000; i++) {
            if(inputNum == decomposeCalculator(Long.toString(i))) {
                constructor = i;
                break;
            }
        }
        System.out.println(constructor);
    }
}
