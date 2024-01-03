package 백준.플래티넘.플래티넘3.Ex5896;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        // int[] : index, price, coupon
        PriorityQueue<int[]> heap1 = new PriorityQueue<>((o1, o2) -> {
            if(o1[1] == o2[1]) {
                return o2[2] - o1[2];
            }
            return o1[1] - o2[1];
        });

        PriorityQueue<int[]> heap2 = new PriorityQueue<>((o1, o2) -> {
            if(o1[2] == o2[2]) {
                return o2[1] - o1[1];
            }
            return o1[2] - o2[2];
        });

        for(int i = 0; i<n;i++) {
            st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int coupon = Integer.parseInt(st.nextToken());
            heap1.add(new int[]{i, price, coupon});
            heap2.add(new int[]{i, price, coupon});
        }

        int count = 0;
        boolean[] isBuy = new boolean[n];
        while(!heap1.isEmpty() && !heap2.isEmpty() && m > 0) {
            int[] price = heap1.peek();
            while(isBuy[price[0]] && !heap1.isEmpty()) {
                price = heap1.poll();
            }
            int[] coupon = heap2.peek();
            while(isBuy[coupon[0]] && heap1.isEmpty()) {
                coupon = heap1.poll();
            }

            if((k == 0 || price[1] <= coupon[2]) && price[1] <= m) {
                heap1.poll();
                isBuy[price[0]] = true;
                m-= price[1];
                count++;
            } else if(k > 0 && coupon[2] <= m){
                heap2.poll();
                isBuy[coupon[0]] = true;
                m-= coupon[2];
                k--;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
