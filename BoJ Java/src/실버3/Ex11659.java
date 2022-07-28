// 11659번 구간합 구하기 4
// 실버 3
// 알고리즘 분류: 누적합

package 실버3;

import java.io.*;
import java.util.StringTokenizer;

public class Ex11659 {
    public static void main(String[] args) throws IOException {
        int N, M;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] sum = new long[n + 1];
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i<= n; i++) {
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            bw.write(sum[j] - sum[i-1] + "");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
