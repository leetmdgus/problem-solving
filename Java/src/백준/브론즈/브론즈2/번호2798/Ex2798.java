package 백준.브론즈.브론즈2.번호2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String[] number = br.readLine().split(" ");

        int[] arr = new int[number.length];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(number[i]);
        }

        int closeM = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                for(int z = j+1;z<arr.length; z++) {
                    int sum = arr[i] + arr[j] + arr[z];
                    if(sum > closeM && sum <= Integer.parseInt(input[1])) {
                        closeM = sum;
                    }
                }
            }
        }
        System.out.println(closeM);
    }
}
