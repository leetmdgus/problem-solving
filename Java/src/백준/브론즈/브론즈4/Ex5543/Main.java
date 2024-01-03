package 백준.브론즈.브론즈4.Ex5543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int burger1 = Integer.parseInt(br.readLine());
        int burger2 = Integer.parseInt(br.readLine());
        int burger3 = Integer.parseInt(br.readLine());

        int drink1 = Integer.parseInt(br.readLine());
        int drink2 = Integer.parseInt(br.readLine());

        int burger = Math.min(burger1, Math.min(burger2, burger3));
        int drink = Math.min(drink1, drink2);
        System.out.println(burger + drink - 50);

    }
}
