package 백준.골드.골드3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] array = new int[N+1];
        for(int i = 1; i<=N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        long[] dp = new long[N+1];
        for(int i = 1; i<=N; i++) {
            dp[i] = dp[i-1] + array[i];
        }
        for(int i = 1; i<=N; i++) {
            dp[i] %= M;
        }

        long sum = 0;
        int count = 0;
        for(int i = 1; i<=N; i++) {
            if(dp[i] == 0) {
                count++;
            }
        }
        sum += count;

        int[] multiCount = new int[M];
        for(int i = 1; i<=N; i++) {
            multiCount[(int)dp[i]] += 1;
        }

        for(int i = 0; i<M; i++) {
            sum += (long) multiCount[i] * (multiCount[i]-1) / 2;
        }
        System.out.println(sum);

    }
}
