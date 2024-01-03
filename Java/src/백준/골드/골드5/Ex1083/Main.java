package 백준.골드.골드5.Ex1083;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int tmpCnt = 0;
        while (s > 0) {
            int maxIdx = tmpCnt;
            if(maxIdx >= n) break;

            for (int i = 0; i <= s; i++) {
                if (tmpCnt + i < n) {
                    if (arr[maxIdx] < arr[tmpCnt + i]) {
                        maxIdx = tmpCnt + i;
                    }
                } else break;
            }

            int cnt = 0;
            for (int i = maxIdx; i > tmpCnt; i--) {
                if (arr[i] > arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    cnt++;
                }
            }

            s -= cnt;
            tmpCnt++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
