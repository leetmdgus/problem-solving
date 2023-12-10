package 백준.브론즈.브론즈2.Ex5585.Greedy;

import java.util.ArrayList;

public class Greedy {
    public void coinFunc(Integer price, ArrayList<Integer> coinList) {
        Integer totalCoinCount = 0;
        Integer coinNum = 0;
        ArrayList<Integer> details = new ArrayList<>();

        for(int i = 0; i<coinList.size(); i++) {
            coinNum = price / coinList.get(i);
            totalCoinCount += coinNum;
            price = price % coinList.get(i);
            details.add(coinNum);
            System.out.println(coinList.get(i) + "원: "+ coinNum + "개");
        }
        System.out.println("최소 동전 개수: " + totalCoinCount);
    }
}
