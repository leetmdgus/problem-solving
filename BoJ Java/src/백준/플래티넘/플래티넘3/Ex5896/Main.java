package 백준.플래티넘.플래티넘3.Ex5896;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
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

        boolean[] isBuy = new boolean[n];

        for(int i = 0; i<n ;i++) {


        }
    }
}
