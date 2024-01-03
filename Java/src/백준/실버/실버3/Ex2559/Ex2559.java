package 백준.실버.실버3.Ex2559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sequence = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] hap = new int[sequence];
        for(int i = 0; i<hap.length; i++) {
            if(i == 0){
                hap[0] =  Integer.parseInt(st.nextToken());
            }else {
                hap[i] = hap[i-1] + Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i = K; i<hap.length; i++) {
            int sum = hap[i] - hap[i-K];

            if(sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
