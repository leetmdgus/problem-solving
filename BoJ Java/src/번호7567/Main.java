package 번호7567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int height = 10;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dishes = br.readLine().split("");

        for(int i = 1; i<dishes.length; i++) {
            if(dishes[i-1] == dishes[i]) {
                height += 5;
            } else {
                height += 10;
            }
        }
        System.out.println(height);
    }
}
