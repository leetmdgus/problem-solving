package 백준.브론즈.브론즈4.Ex27110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int remainChicken = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Chicken prefer = new Chicken(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        int max = 0;
        max += remainChicken - prefer.fried >= 0     ? prefer.fried     : remainChicken;
        max += remainChicken - prefer.soy   >= 0     ? prefer.soy       : remainChicken;
        max += remainChicken - prefer.seasoning >= 0 ? prefer.seasoning : remainChicken;

        System.out.println(max);
    }
}

class Chicken {
    int fried;
    int soy;
    int seasoning;

    public Chicken(int fried, int soy, int seasoning) {
        this.fried = fried;
        this.soy = soy;
        this.seasoning = seasoning;
    }
}
