package 백준.브론즈.브론즈5.Ex5597;

import java.util.Scanner; // Scanner 임포트

public class Ex5597 {
    // 필드
    static Scanner sc = new Scanner(System.in); // 정적 Scanner 생성
    static boolean[] student = new boolean[30]; // 크기가 30인 정적 boolean형 배열 선언

    // 메소드 - 과제를 제출하지 않은 학생 2명의 출석 번호를 구해 주는 메소드

    public void unsubmittedStudentNumMethod() {
        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt(); // 입력받는 출석번호
            student[n - 1] = true; // 출석번호를 입력받으면, 그 값을 true로 간주함
        }
        // false값 출력하려고 하는데, 여기서 i for문과 j for문은 병렬적으로 돌아가는건가?
        for (int j = 0; j < 30; j++) {
            if (!student[j]) {
                System.out.println(j + 1);
            }
        }
    }

    // 메인 메소드
    public static void main(String[] args) {
        Ex5597 main = new Ex5597(); // Main 클래스 이용
        main.unsubmittedStudentNumMethod(); // 메소드 호출
    }
}