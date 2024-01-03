package 백준.브론즈.브론즈2.Ex5585.Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Greedy greedy = new Greedy();
        ArrayList<Integer> coinList = new ArrayList<>(Arrays.asList(500, 100, 50, 10, 5, 1));
        greedy.coinFunc(4720, coinList);
    }
}
