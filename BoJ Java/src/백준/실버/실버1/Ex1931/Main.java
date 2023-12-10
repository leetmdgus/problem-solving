package 백준.실버.실버1.Ex1931;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        List<int[]> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arrayList.add(new int[]{start, end});
        }

        Collections.sort(arrayList, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);

        int count = 0;
        int time = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)[0] >= time) {
                count++;
                time = arrayList.get(i)[1];
            }
        }
        System.out.println(count);
    }
}
