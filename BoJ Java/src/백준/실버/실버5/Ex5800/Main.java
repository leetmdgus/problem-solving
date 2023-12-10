package 백준.실버.실버5.Ex5800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int currentClass = 1; currentClass <=k; currentClass++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            for(int i = 0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int max = arr[arr.length-1];
            int min = arr[0];
            int gap = 0;
            for(int i = n-1; i>0; i--) {
                gap = Math.max(arr[i] - arr[i-1], gap);
            }
            sb.append("Class ").append(currentClass).append('\n');
            sb.append("Max ").append(max).append(", Min ").append(min).append(", Largest gap ").append(gap).append('\n');
        }
        System.out.println(sb);
    }
}
