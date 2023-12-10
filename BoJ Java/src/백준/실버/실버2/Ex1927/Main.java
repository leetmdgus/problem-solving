package 백준.실버.실버2.Ex1927;
import java.io.BufferedReader; // BufferedReader 임포트
import java.io.BufferedWriter; // BufferedWriter 임포트
import java.io.InputStreamReader; // InputStreamReader 임포트
import java.io.OutputStreamWriter; // OutputStreamWriter 임포트
import java.util.PriorityQueue; // PriorityQueue 임포트


public class Main {
    // 필드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 정적 BufferedReader 생성
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 정적 BufferedWriter 생성
    static int x; // 배열에 넣을 자연수 x

    // 메소드 - x가 자연수라면 배열에 x라는 값을 추가해주고, 0이라면 배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 메소드
    public void minHeapCalculationMethod() throws Exception {
        final int N = Integer.parseInt(br.readLine()); // 연산의 개수 N
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 오름차순 PriorityQueue 생성

        for (int i = 0; i < N; i++) {
            if (x == 0) { // x가 0인 경우
                if (pq.isEmpty()) {
                    String s = "0";
                    bw.write(s + "\n"); // 0 출력
                }
                else {
                    bw.write(pq.poll() + "\n"); // 최소 힙의 root node 출력
                }
            }

            else {
                pq.add(x);
            }
        }

        bw.flush(); // Buffer 비우기

        br.close(); // BufferedReader 사용 종료
        bw.close(); // BufferedWriter 사용 종료


    }

    public static void main(String[] args) throws Exception{
        Main main = new Main();
        main.minHeapCalculationMethod();
    }

}