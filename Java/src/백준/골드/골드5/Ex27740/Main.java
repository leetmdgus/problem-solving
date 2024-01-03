package 백준.골드.골드5.Ex27740;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static Set<Integer> set = new HashSet<>();
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = 0;
        for (int i = n - 1; i >= 0; i--) {
            num += Math.pow(10, i) * Integer.parseInt(st.nextToken());
        }

        String str = bfs(num);

        System.out.println(str.length());
        System.out.println(str);
    }

    public static String bfs(int num) {
        Queue<NumOrder> q = new LinkedList<>();
        q.add(new NumOrder(num, ""));
        set.add(num);

        while(!q.isEmpty()) {
            NumOrder now = q.poll();

            if(now.num == 0) {
                return now.order;
            }

            int lNum = lShift(now.num);
            int rNum = rShift(now.num);

            if(!set.contains(lNum)) {
                set.add(lNum);
                q.add(new NumOrder(lNum, now.order+"L"));
            }
            if(!set.contains(rNum)) {
                set.add(rNum);
                q.add(new NumOrder(rNum, now.order+"R"));
            }
        }
        return null;
    }

    public static int lShift(int num) {
        int newNum = num;
        if(num > Math.pow(10, n-1)) {
            newNum = num - num / (int) Math.pow(10, (n - 1)) * (int) Math.pow(10, (n - 1));
        }
        newNum *= 10;
        return newNum;
    }

    public static int rShift(int num) {
        int newNum = num / 10;
        return newNum;
    }
    static class NumOrder {
        int num;
        String order;

        public NumOrder(int num, String order) {
            this.num = num;
            this.order = order;
        }
    }
}