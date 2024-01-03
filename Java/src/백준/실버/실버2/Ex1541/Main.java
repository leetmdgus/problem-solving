package 백준.실버.실버2.Ex1541;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sub =  new StringTokenizer(br.readLine(), "-");

        int res = Integer.MAX_VALUE;
        while(sub.hasMoreTokens()) {
            int tmp = 0;
            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");

            while(add.hasMoreTokens()) {
                tmp += Integer.parseInt(add.nextToken());
            }

            if(res == Integer.MAX_VALUE) {
                res = tmp;
            } else {
                res -= tmp;
            }
        }

        System.out.println(res);
    }
}