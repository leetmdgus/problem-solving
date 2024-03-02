package 백준.실버.실버1.Ex11052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n + 1];
        dp[1] = arr[1];
        for (int i = 1; i <= n; i++) {
            int max = 0;
            for (int j = 1; j < i; j++) {
                max = Math.max(dp[j] + dp[i - j], max);
            }
            dp[i] = Math.max(max, arr[i]);
        }

        System.out.println(dp[n]);
    }
}

///  일단 조합으로 N를 만들 수 있는 경우를 생각한다.

/// 1-> 1
/// 2-> 1*2, 2
/// 3-> 1*3, 1*2+1, 1+2, 3
/// 4-> 1*4 ,1*2+2, 1+3, 2+2, 4
/// 5-> 1*5, 1*3+2,1*2+3,1+2+2,2+3, 5
/// 6-> 1*6, 1*4+2,1*3+3,1*2+4 +1+5, 2*3, 2


/// dp를 이용해야할 것 같은데...