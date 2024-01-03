package 백준.플래티넘.플래티넘3.Ex10542;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int n, max;
    public static int[] arr;
    public static int[] isMafia; // 0 마피아시민 1 마피아 -1 시민
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n+1];
        isMafia = new int[n+1];
        visited = new boolean[n+1];

        for(int i = 1; i<=n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int mafia = 1; mafia<=n; mafia++) {
            Arrays.fill(isMafia, 0);

            int people = 0; // 지정한 사람 수
            // 확실한 마피아 지정
            isMafia[mafia] = 1;

            // 확실한 마피아를 지목한 자는 확실한 시민임.
            for(int i = 1; i<=n ;i++) {
                if(arr[i] == mafia) {
                    isMafia[i] = -1;
                }
            }

            // 나머지는 마피아 / 시민임
            dfs(0);
        }

        System.out.println(max);
    }

    public static void dfs(int depth) {
        int cnt = 0;
        for(int i = 1; i<=n ;i++) {
            if(isMafia[i] == 1) {
                cnt++;
            }
        }
        max = Math.max(max, cnt);


        for(int i = 1; i<=n; i++) {
            // 시민인지 시민이 아닌지 애매할 경우
            if(isMafia[i] == 0) {
                // 일단 마피아로 고려
                isMafia[i] = 1;

                // 마피아가 지목한 사람은 시민임
                for(int j = 1; j<=n ;j++) {
                    if(arr[j] == i) {
                        isMafia[j] = -1;
                        depth++;
                    }
                }

                // 다시 나머지는 마피아 / 시민임
                dfs(depth+1);

                // 그 후 시민으로 고려
                isMafia[i] = -1;
            }
        }
    }
}
