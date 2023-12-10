/*
    10757번 큰수 A+B
    백준.브론즈 5
    알고리즘 분류: 수학, 구현, 사칙연산, 임의 정밀도/ 큰 수 연산

*/

package 백준.브론즈.브론즈5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10757_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String str_A = st.nextToken();
        String str_B = st.nextToken();

        int max_length = Math.max(str_A.length(), str_B.length());

        int[] A = new int[max_length + 1];
        int[] B = new int[max_length + 1];



    }
}
