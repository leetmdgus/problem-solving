package 백준.실버.실버5.Ex1094;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int cut = 0;
        int length = 64;

        while(x > 0) {
            if(x < length) {
                length /= 2;
            } else {
                x-= length;
                cut++;
            }
        }
        System.out.println(cut);
    }
}
