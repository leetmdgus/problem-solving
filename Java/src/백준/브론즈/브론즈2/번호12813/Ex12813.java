/*12813번
이진수 연산
알고리즘 분류: 문자열, 이진수
 */

package 백준.브론즈.브론즈2.번호12813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12813 {
    private static final int BINARY_NUM_LENGTH = 100000;
    private static void and(String A, String B) {
        char[] aArray = A.toCharArray();
        char[] bArray = B.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<BINARY_NUM_LENGTH; i++) {
            if(aArray[i] == '0' || bArray[i] == '0') {
                sb.append(0);
            } else {
                sb.append(1);
            }
        }
        System.out.println(sb);
    }

    private static void or(String A, String B) {
        char[] aArray = A.toCharArray();
        char[] bArray = B.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<BINARY_NUM_LENGTH; i++) {
            if(aArray[i] == '1' || bArray[i] == '1') {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        System.out.println(sb);
    }

    private static void xor(String A, String B) {
        char[] aArray = A.toCharArray();
        char[] bArray = B.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<BINARY_NUM_LENGTH; i++) {
            if(aArray[i] == bArray[i]){
                sb.append(0);
            } else {
                sb.append(1);
            }
        }
        System.out.println(sb);
    }

    private static void not(String A) {
        A = A.replace('1','2');
        A = A.replace('0','1');
        A = A.replace('2','0');
        System.out.println(A);
    }

    private static void showCalculation(String A, String B) {
        and(A, B);
        or(A, B);
        xor(A, B);
        not(A);
        not(B);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        showCalculation(A, B);
    }
}
