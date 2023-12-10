/*
    10757번 큰수 A+B
    백준.브론즈 5
    알고리즘 분류: 수학, 구현, 사칙연산, 임의 정밀도/ 큰 수 연산

*/
package 백준.브론즈.브론즈5;

import java.io.*;
import java.math.BigInteger;

public class Ex10757 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        BigInteger A = new BigInteger(str[0]);
        BigInteger B = new BigInteger(str[1]);

        BigInteger S = A.add(B);
        System.out.println(S);
    }
}
