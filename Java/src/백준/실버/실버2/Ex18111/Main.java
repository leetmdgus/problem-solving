package 백준.실버.실버2.Ex18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        int maxL = Integer.MIN_VALUE;
        int minL = Integer.MAX_VALUE;

        for(int i =0 ;i<N;i ++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                maxL = Math.max(arr[i][j], maxL);
                minL = Math.min(arr[i][j], minL);
            }
        }

        int time = Integer.MAX_VALUE;
        int l = 0;
        for(int i = minL; i<=maxL ;i++) {
            int haveBlock = K;
            int t = 0;

            for(int j = 0; j<N; j++) {
                for(int k = 0; k<M; k++) {
                    int num = arr[j][k];
                    while(num > i) {
                        t+=2;
                        num--;
                        haveBlock++;
                    }
                    while(num < i) {
                        t++;
                        num++;
                        haveBlock--;
                    }
                }
            }

            if(haveBlock >= 0 && t <= time) {
                time = t;
                l = i;
            }
        }

        System.out.println(time + " " + l);

    }
}
