package 백준.실버.실버4.Ex1049;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<int[]> list1 = new ArrayList<>();
        ArrayList<int[]> list2 = new ArrayList<>();

        for(int i = 0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int set = Integer.parseInt(st.nextToken());
            int one = Integer.parseInt(st.nextToken());
            list1.add(new int[]{set, one});
            list2.add(new int[]{set, one});
        }

        Collections.sort(list1, Comparator.comparingInt(o -> o[0]));
        Collections.sort(list2, Comparator.comparingInt(o -> o[1]));

        int buy = n;
        int money = 0;

        while(buy >= 6) {
            int m1 = list1.get(0)[0];
            int m2 = list2.get(0)[1] * 6;

            money += Math.min(m1, m2);
            buy -= 6;
        }

        int m1 = list1.get(0)[0];
        int m2 = list2.get(0)[1] * buy;

        money += Math.min(m1, m2);

        System.out.println(money);
    }
}
