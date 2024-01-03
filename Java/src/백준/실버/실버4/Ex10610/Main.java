package 백준.실버.실버4.Ex10610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split("");
        StringBuilder answer = new StringBuilder();

        int sum = 0;
        boolean containZero = false;
        for(int i = 0; i<n.length; i++) {
            int num = Integer.parseInt(n[i]);
            sum += num;
            if(num == 0) {
                containZero = true;
            }
        }

        if(!containZero || sum % 3 != 0) {
            answer.append("-1");
        } else {
            Arrays.sort(n, Comparator.comparingInt(Integer::parseInt));
            for(int i= n.length-1; i>=0; i--) {
                answer.append(n[i]);
            }
        }

        System.out.println(answer);
    }
}
