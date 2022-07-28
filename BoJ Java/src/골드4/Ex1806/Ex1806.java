package 골드4.Ex1806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for(int i = 0; i< array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        long[] hap = new long[N];
        for(int i = 0; i<N; i++){
            if(i == 0) {
                hap[0] = array[0];
            } else{
                hap[i] = hap[i-1] + array[i];
            }
        }

        for(long a : hap) {
            System.out.print( a +" ");
        }
        System.out.println();


        int start = 0;
        int end = 1;
        int count = array[0] == S ? 1: 0;



        System.out.println(count);
    }
}
