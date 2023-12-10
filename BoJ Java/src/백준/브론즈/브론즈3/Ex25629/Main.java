package 백준.브론즈.브론즈3.Ex25629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int even = 0;
        int odd = 0;

        int evenNum = 0;
        int oddNum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a % 2 == 0 && evenNum <= a) {
                evenNum = a;
                even++;
            } else if(a % 2 != 0 && oddNum <= a) {
                oddNum = a;
                odd++;
            } else {
                System.out.println(0);
                return;
            }
        }

        int diff = Math.abs(odd - even);
        if(diff <= 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
