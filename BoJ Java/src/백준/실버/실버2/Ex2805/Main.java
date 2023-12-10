package 백준.실버.실버2.Ex2805;

import java.io.BufferedReader; // BufferedReader 임포트
import java.io.BufferedWriter; // BufferedWriter 임포트
import java.io.InputStreamReader; // InputStreamReader 임포트
import java.io.OutputStreamWriter; // OutputStreamWriter 임포트
import java.util.StringTokenizer; // StringTokenizer

// 클래스
public class Main {
    // 필드
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 생성
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter 생성
    static long sum; // 잘려진 나무의 총합

    // 메소드 - 적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값을 출력하는 메소드
    public void treeLengthMethod() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 생성, 한 줄에 두 token 입력받기 위해 빈칸으로 띄워 줌
        int N = Integer.parseInt(st.nextToken()); // 나무의 수 N
        int M = Integer.parseInt(st.nextToken()); // 상근이가 집에 가져갈 나무의 길이 M
        int[] trees = new int[N]; // 나무 길이를 입력받아 저장하는 배열

        // 이진탐색 사용 시작
        int left = 0, right = trees.length - 1; // left 값, right 값 설정

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            trees[i] = x; // N개의 숫자를 N회에 걸쳐 trees 배열 안에 채워 주기
            right = Math.max(right, x); // 입력받은 숫자 중 최댓값이 right이 됨
        }

        int mid = 0;
        while (left <= right) {
            sum = 0;
            mid = (left + right) / 2;

            for (int i = 0; i < N; i++) {
                if (trees[i] > mid) {
                    sum += trees[i] - mid;
                }
            }
            if (M <= sum) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        bw.write(String.valueOf(right));

        bw.flush();

        br.close();
        bw.close();
    }

    // 메인 메소드
    public static void main(String[] args) throws Exception {
        Main main = new Main(); // Main 클래스 이용
        main.treeLengthMethod(); // 메소드 호출
    }
}