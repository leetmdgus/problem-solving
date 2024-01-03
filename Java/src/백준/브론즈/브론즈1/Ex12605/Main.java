package 백준.브론즈.브론즈1.Ex12605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int c = 1; c<=n; c++ ) {
            String[] arr = br.readLine().split(" ");

            sb.append("Case #"+c+": ");
            for(int i = arr.length-1; i>=0; i--) {
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
