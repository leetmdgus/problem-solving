package 백준.실버.실버3.Ex1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) { // t번 반복문을 돌립니다.
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            // 중점을 잇는 선분의 길이 구하기
            double l = Math.sqrt((Math.pow(x1 - x2, 2)) + Math.pow(y1 - y2, 2));

            if (x1 == x2 && y1 == y2 && r1 == r2) {// 빨간원과 파란원이 겹칠 때
                System.out.println(-1);
            } else if (l > r1 + r2) { //만나지 않을 때
                System.out.println(0);
            } else if (l + Math.min(r1, r2) < Math.max(r1, r2)) {//만나지 않을 때
                System.out.println(0);
            } else if (l == r1 + r2) { // 외접할 때
                System.out.println(1);
            } else if (l + Math.min(r1, r2) == Math.max(r1, r2)) {// 내접할 때
                System.out.println(1);
            } else { // 빨간원과 파란원이 만날 때
                System.out.println(2);
            }
        }
    }
}
