package 백준.골드.골드5.Ex2467;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st =new StringTokenizer(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0; i<n; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        int p1 = 0;
        int p2 = arrayList.size() -1;
        int getP1 = 0;
        int getP2 = 0;
        int result = Integer.MAX_VALUE;
        while(p1 < p2) {
            int sum = arrayList.get(p1) + arrayList.get(p2);
            if(Math.abs(sum) < Math.abs(result)) {
                result = sum;
                getP1 = arrayList.get(p1);
                getP2 = arrayList.get(p2);
            }


            if(sum < 0) {
                p1++;
            } else {
                p2--;
            }
        }

        System.out.println(getP1 + " " +getP2);
    }
}
