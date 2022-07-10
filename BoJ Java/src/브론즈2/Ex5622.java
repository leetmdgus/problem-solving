/* 5622번 다이얼
알고리즘 분류: 구현
* */

package 브론즈2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex5622 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();

        final int BASIC_REQUIRED_TIME = 1;
        int[] requiredTime = new int[15];

        for(int i = 0; i<word.length; i++) {
            switch(word[i]) {
                case('A'): case('B'): case( 'C'):
                    requiredTime[i] = BASIC_REQUIRED_TIME + 2;
                    break;
                case('D'): case('E'): case('F'):
                    requiredTime[i] = BASIC_REQUIRED_TIME + 3;
                    break;
                case('G'): case('H'): case('I'):
                    requiredTime[i] = BASIC_REQUIRED_TIME + 4;
                    break;
                case('J'): case('K'): case('L'):
                    requiredTime[i] = BASIC_REQUIRED_TIME + 5;
                    break;
                case('M'): case('N'): case('O'):
                    requiredTime[i] = BASIC_REQUIRED_TIME + 6;
                    break;
                case('P'): case('Q'): case('R'): case('S'):
                    requiredTime[i] = BASIC_REQUIRED_TIME + 7;
                    break;
                 case('T'): case('U'):case('V'):
                    requiredTime[i] = BASIC_REQUIRED_TIME + 8;
                    break;
                case('W'): case('X'): case('Y'):case('Z'):
                    requiredTime[i] = BASIC_REQUIRED_TIME + 9;
                    break;
            }
        }
        System.out.println(Arrays.stream(requiredTime).sum());
    }
}
