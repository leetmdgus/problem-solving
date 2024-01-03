package 백준.브론즈.브론즈1.Ex1157;

import java.util.Scanner; // Scanner 임포트
public class zex1157 {
    // 필드
    Scanner sc = new Scanner(System.in); // Scanner 생성
    String str = sc.nextLine().toUpperCase(); // 단어 입력 후 대문자로 출력
    int[] arr = new int[26]; // A ~ Z까지의 알파벳이 몇 번 나왔는지, 그 횟수를 저장할 크기 26의 배열
    int max; // 가장 많이 사용된 알파벳 갯수
    char maxAlphabet; // 가장 많이 사용된 알파벳
    // 생성자
    zex1157(int max) {
        this.max = max;
    } // 초기화
    // 메소드 - 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 메소드

    public void maxAlphabetMethod() {
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A']++; // 나온 단어에 해당하는 인덱스의 정수 값 1씩 증가시키기
            if (max < arr[str.charAt(i) - 'A']) {
                max = arr[str.charAt(i) - 'A']; // 나온 단어에 해당하는 인덱스의 정수 값이 가장 큰 char를
                maxAlphabet = str.charAt(i); // 출력
            }
            else if (max == arr[str.charAt(i) - 'A']) { // 이 부분의 원리를 잘 모르겠음
                maxAlphabet = '?'; // 출력
            }
        }
        System.out.println(maxAlphabet); // 가장 많이 사용된 알파벳 출력
    }
    public static void main(String[] args) {
        zex1157 main = new zex1157(0); // Main 클래스 이용
        main.maxAlphabetMethod(); // 메소드 호출
    }
}