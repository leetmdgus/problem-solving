package 백준.실버.실버4.Ex1940;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        if (n == 1) {
            if (arrayList.get(0) == m) {
                System.out.println(1);
            }
            return;
        }

        Collections.sort(arrayList);

        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(m==arrayList.get(i)+ arrayList.get(j)){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
