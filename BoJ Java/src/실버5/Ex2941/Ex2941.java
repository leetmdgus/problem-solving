package 실버5.Ex2941;

import java.util.Scanner; // Scanner 임포트

public class Ex2941 {
    // 필드
    Scanner sc = new Scanner(System.in); // Scanner 생성
    String croatianAlphabet[] = {"c=", "c-", "dz-", "d-", "lj", "nj", "s=", "z="}; // 배열을 만들어서 크로아티아 알파벳 입력


    // 생성자
    Ex2941() {} // 초기화

    // 메소드 - 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
    public void howManyCroatianAlphabetsMethod() {
        String str = sc.nextLine(); // 크로아티아 알파벳이 몇 개 있는지 체크하고 싶은 문자열 입력
        for (String s : croatianAlphabet) {
            if (str.contains(s)) {
                str = str.replace(s, "!");
            }
        }
        System.out.println(str);
        System.out.println(str.length());
    }

    // 메인 메소드
    public static void main(String[] args) {
        Ex2941 main = new Ex2941();
        main.howManyCroatianAlphabetsMethod();
    }
}