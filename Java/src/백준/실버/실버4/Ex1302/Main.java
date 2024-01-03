package 백준.실버.실버4.Ex1302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        for(int i = 0; i<n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);

        int max = 1;
        int length = 1;
        String word = arr[0];

        for(int i = 1; i<n; i++) {
            if(arr[i].equals(arr[i-1])) {
               length++;
            } else {
                length = 1;
            }

            if(length > max) {
                max = length;
                word = arr[i];
            }
        }
        System.out.println(word);
    }
}
