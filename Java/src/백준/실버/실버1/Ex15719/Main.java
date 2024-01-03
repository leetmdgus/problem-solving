package 백준.실버.실버1.Ex15719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10000001];
        int res = 0;
        for (int i = 0; i < n; i++) {
            int idx =Integer.parseInt(st.nextToken());
            if(arr[idx] != 0) {
                res = idx;
                break;
            }
            arr[idx]++;
        }
        System.out.println(res);
    }
}
