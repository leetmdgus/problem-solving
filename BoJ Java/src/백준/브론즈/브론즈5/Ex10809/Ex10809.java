package 백준.브론즈.브론즈5.Ex10809;

import java.util.Arrays; // Arrays 임포트
import java.util.Scanner; // Scanner 임포트

public class Ex10809 {
    // 필드
    Scanner sc = new Scanner(System.in); // Scanner 생성
    String str = sc.nextLine(); // 문자열을 입력받기 위한 String 하나 만들기
    int[] arr = new int[26]; // 크기가 26인 int형 배열 생성

    // 생성자
    Ex10809() {} // 초기화

    // 메소드 - 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 메소드
    public void alphabetMethod() {
        Arrays.fill(arr, -1); // 배열 arr를 모두 -1로 채우기

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // 문자형 변수 ch 안에 str.char(0)부터 str.char(str.length() - 1) 까지 문자열의 문자들 한 글자씩 저장
            // str.charAt(i) -> str이 가리키고 있는 문자열에서 i번째 문자의 char 타입을 반환

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {

    }
}