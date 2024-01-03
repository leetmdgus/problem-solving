package 백준.실버.실버3.Ex2559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i<n ;i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        int p1 = 0;
        int p2 = p1+k-1;
        int tmp = 0;
        for(int i =p1 ;i <= p2; i++) {
            tmp += arrayList.get(i);
        }

        int sum = tmp;
        while(p2+1 < n) {

            sum -= arrayList.get(p1++);
            sum += arrayList.get(++p2);

            tmp = Math.max(tmp, sum);
        }

        System.out.println(tmp);
    }
}
