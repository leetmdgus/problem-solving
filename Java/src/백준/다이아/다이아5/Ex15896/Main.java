package 백준.다이아.다이아5.Ex15896;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int[] arr1, arr2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr1 = new int[n];
        arr2 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n ;i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int res1 = 0;
        int res2 = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n ;i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
            if(i == 0) {
                res2 = arr1[0] + arr2[0];
            }

            for(int j = 0; j<n; j++) {
                res1 = (res1 + (arr1[j] & arr2[i])) % 1999;
                res2 = (res2 & (arr1[j] + arr2[i]));
            }
        }

        System.out.println(res1 % 1999 + " "+res2);
    }
}
