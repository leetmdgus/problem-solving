package 브론즈2.Ex2292;

import java.util.Scanner; // Scanner 임포트

public class Main {
    // 필드
    Scanner sc = new Scanner(System.in); // Scanner 생성
    int range; // 1번 방을 기준으로, 떨어져 있는 범위
    int step; // 방에서 방으로의 이동 횟수

    // 생성자
    Main(int range, int step) {
        this.range = range;
        this.step = step;
    } // 초기화

    // 메소드 - 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여) 계산하는 메소드
    public void beeHive() {
        int N = sc.nextInt(); // 벌집 방 번호
        while (range < N) { // 여기부터 이해 가지않음
            range = range + (6 * (step++));
        }
        System.out.println(step);
    }
    /*
    벌집 모양을 기준으로

    1
    (+ 6)
    2 ~ 7
    (+ 12)
    8 ~ 19
    (+ 18)
    20 ~ 37
    (+ 24)
    38 ~ 61

    가 된다.
     */

    // 메인 메소드
    public static void main(String[] args) {
        Main main = new Main (1, 1);
        main.beeHive();
    }
}