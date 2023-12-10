package 백준.브론즈.브론즈2.Ex15829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] strArr = br.readLine().toCharArray();

        long sum = 0;
        long pow = 1;
        for(int i = 0; i<n; i++) {
            sum += (strArr[i]-'a'+1) * pow;
            pow = (pow * 31) % 1234567891;
        }

        System.out.println(sum % 1234567891);
    }
}
