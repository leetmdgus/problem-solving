package 백준.실버.실버5.Ex11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arrA = new int[n];
        int[] arrB = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i= 0; i<n; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<m; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }


        ArrayList<Integer> result = new ArrayList<>();

        int pA = 0;
        int pB = 0;
        while(pA < n && pB<m) {
            if(arrA[pA] < arrB[pB]) {
                result.add(arrA[pA++]);
            } else {
                result.add(arrB[pB++]);
            }
        }
        while(pA < n) {
            result.add(arrA[pA++]);
        }
        while(pB<m) {
            result.add(arrB[pB++]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i : result) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
