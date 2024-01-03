package 백준.실버.실버2.Ex2075;

import java.io.BufferedReader; // BufferedReader 임포트
import java.io.BufferedWriter; // BufferedWriter 임포트
import java.io.InputStreamReader; // InputStreamReader 임포트
import java.io.OutputStreamWriter; // OutputStreamWriter 임포트
import java.util.Collections; // Collections 임포트
import java.util.PriorityQueue; // PriorityQueue 임포트
import java.util.StringTokenizer; // StringTokenizer 임포트


// 클래스
public class Main_2 {
    // 필드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 정적 BufferedReader 생성
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 정적 BufferedWriter 생성

    // 메소드 - x가 자연수라면 배열에 x라는 값을 추가해주고, 0이라면 배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 메소드
    public void NthLargestNumMethod() throws Exception {
        final int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                final int x = Integer.parseInt(st.nextToken());
                pq.add(x);
            }
        }

        for (int i = 0; i < N-1; i++) {
            pq.poll();    //최댓값뽑기
        }
        bw.write(pq.poll() + "\n");//최댓값 출력

        bw.flush(); // Buffer 비우기

        br.close(); // BufferedReader 사용 종료
        bw.close(); // BufferedWriter 사용 종료


    }


    public static void main(String[] args) throws Exception {
        Main_2 main = new Main_2();
        main.NthLargestNumMethod();
    }
}