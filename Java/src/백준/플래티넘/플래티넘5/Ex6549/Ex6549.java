package 백준.플래티넘.플래티넘5.Ex6549;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex6549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int count = Integer.parseInt(st.nextToken());
            if (count == 0) {
                break;
            }

            // 각 판자의 높이를 저장하는 배열, 마지막 인덱스에는 0이 들어간다.
            int[] heightArr = new int[count + 1];
            for (int i = 0; i < count; i++) {
                heightArr[i] = Integer.parseInt(st.nextToken());
            }


            //남아 있는 판자들의 위치를 저장한다.
            Stack<Integer> remaining = new Stack<>();
            int ret = 0;
            for(int i = 0; i< heightArr.length; ++i) {
                // 남아 있느 판자들 중 오른쪽 끝 판자가 h[i]보다 높다면
                // 이 판자의 최대 사각형은 i에서 끝난다.
                while(!remaining.isEmpty() && heightArr[remaining.peek()] >- heightArr[i]) {
                    int j = remaining.pop();
                    int width = -1;
                    // j번째 판자 왼쪽에 판자가 하나도 안 남아 있는 경우 left[j] = -1,
                    // 아닌 경우 left[j] = 남아있는 판자 중 가장 오른 쪽에 있는 판자 번호
                    // 가 된다.

                    if(remaining.isEmpty()) {
                        width = i;
                    } else {
                        width = (i - remaining.peek() -1);
                    }
                    ret = Math.max(ret, heightArr[j] * width);
                }
                remaining.push(i);
            }

            System.out.println(ret);
        }
    }
}
