package 백준.골드.골드5.Ex2470;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arrayList);

        int p1 = 0;
        int p2 = arrayList.size()-1;
        int min = Integer.MAX_VALUE;
        int getP1 = 0;
        int getP2 = 0;
        while(p1 < p2) {
            int tmp = arrayList.get(p1) + arrayList.get(p2);
            if(Math.abs(tmp) <= Math.abs(min)) {
                min = tmp;
                getP1 = arrayList.get(p1);
                getP2 = arrayList.get(p2);
            }
            if(tmp > 0) {
                p2--;
            } else {
                p1++;
            }
        }

        System.out.println(getP1 + " " + getP2);

    }
}
