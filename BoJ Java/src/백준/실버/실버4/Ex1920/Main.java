import java.io.BufferedReader; // BufferedReader 임포트
import java.io.BufferedWriter; // BufferedWriter 임포트
import java.io.InputStreamReader; // InputStreamReader 임포트
import java.io.OutputStreamWriter; // OutputStreamWriter 임포트
import java.util.PriorityQueue; // PriorityQueue 임포트
import java.util.StringTokenizer; // StringTokenizer 임포트

// 클래스
public class Main {
    // 필드
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 생성
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter 생성
    static StringBuilder sb = new StringBuilder(); // 정적 StringBuilder 생성

    // 메소드 - 수가 존재하면 1을, 존재하지 않으면 0을 출력하는 메소드
    public void findNumMethod() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer 생성
        final int N = Integer.parseInt(st.nextToken()); // 주어지는 수 N개
        int[] arr = new int[N]; // N 크기의 배열 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // PriorityQueue 생성

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            final int x = Integer.parseInt(st.nextToken()); // N개의 정수 입력받기
            pq.add(x);
        }

        for (int i = 0; i < N; i++) {
            arr[i] = pq.poll();
        }

        st = new StringTokenizer(br.readLine());
        final int M = Integer.parseInt(st.nextToken()); // N에 존재하는지의 여부를 찾을 숫자 M

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            if (binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1 + "\n");
            }
            else {
                sb.append(0 + "\n");
            }
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        br.close();
        bw.close();



    }

    public static int binarySearch(int[]arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target < arr[mid]) {
                right = mid - 1;
            }
            else if (target > arr[mid]) {
                left = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.findNumMethod();
    }


}