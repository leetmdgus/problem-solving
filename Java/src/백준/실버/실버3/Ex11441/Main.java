package 백준.실버.실버3.Ex11441;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];

        StringTokenizer st= new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        for(int i = 1; i<n; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        for(int k = 0; k<m; k++) {
            st= new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) -1;
            int j = Integer.parseInt(st.nextToken()) -1;

            if(i != 0) {
                sb.append(arr[j] - arr[i-1]).append('\n');
            } else {
                sb.append(arr[j]).append('\n');
            }
        }

        System.out.println(sb);
    }
}
