package 백준.브론즈.브론즈2.Ex5585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] coin = {500, 100, 50, 10, 5, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        int consumerPay = 1000;
        int remain = consumerPay - price;

        int count = 0;
        for(int idx = 0; idx < coin.length; idx++) {
            count += remain / coin[idx];
            remain = remain % coin[idx];
        }

        System.out.println(count);
    }
}
