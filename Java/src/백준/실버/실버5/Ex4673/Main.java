package 백준.실버.실버5.Ex4673;

import java.util.Arrays;

public class Main {
    static boolean[] isSelfNum = new boolean[10001];

    public static void main(String[] args) {
        Arrays.fill(isSelfNum, true);

        for (int i = 1; i <= 10000; i++) {
            d(i);
        }

        for(int i = 1; i<=10000; i++) {
            if(isSelfNum[i]) {
                System.out.println(i);
            }
        }
    }

    public static void d(int n) {
        int ans = n;
        int i = n;

        while (i != 0) {
            ans += i%10;
            i /= 10;
        }

        if(ans <= 10000) {
            isSelfNum[ans] = false;
        }
    }
}
