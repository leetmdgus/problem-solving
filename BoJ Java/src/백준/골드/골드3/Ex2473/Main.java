package 백준.골드.골드3.Ex2473;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Long> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(Long.parseLong(st.nextToken()));
        }
        Collections.sort(arrayList);

        long getStart = 0;
        long getMid = 0;
        long getEnd = 0;

        long result = Long.MAX_VALUE;

        for(int start = 0; start<n-2; start++) {
            int mid = start+1;
            int end = arrayList.size() - 1;

            while (mid < end) {
                long sum = arrayList.get(start) + arrayList.get(mid) + arrayList.get(end);
                if(Math.abs(sum) < Math.abs(result)) {
                    result = sum;
                    getStart = arrayList.get(start);
                    getMid = arrayList.get(mid);
                    getEnd =arrayList.get(end);
                }
                if (sum < 0) {
                    mid++;
                } else {
                    end--;
                }
            }
        }

        System.out.println(getStart + " " + getMid + " " + getEnd);
    }
}