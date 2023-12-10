// 7567번 그릇
// 백준.브론즈 2
// 알고리즘 분류: 구현, 문자열

package 백준.브론즈.브론즈2.번호7567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7567 {
    public static void main(String[] args) throws IOException {
        int height = 10;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dishes = br.readLine().split("");

        for(int i = 1; i<dishes.length; i++) {
            if(dishes[i-1] == dishes[i]) {
                height += 5;
            } else {
                height += 10;
            }
        }
        System.out.println(height);
    }
}
