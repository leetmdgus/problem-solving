package 백준.실버.실버5.Ex23253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(br.readLine());
            Integer[] arr = new Integer[k];
            Integer[] sortArr = new Integer[k];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
              arr[j] = Integer.parseInt(st.nextToken());
              sortArr[j] = arr[j];
            }

            Arrays.sort(sortArr, Collections.reverseOrder());
            if(!Arrays.equals(arr, sortArr)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
