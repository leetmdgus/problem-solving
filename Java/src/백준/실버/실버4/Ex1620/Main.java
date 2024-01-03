package 백준.실버.실버4.Ex1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n+1];
        Map<String, Integer> map = new HashMap<>();

        for(int i = 1; i<=n; i++) {
            arr[i] = br.readLine();
            map.put(arr[i], i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<m; i++) {
            String order = br.readLine();
            if(isInteger(order)) {
                int idx = Integer.parseInt(order);
                sb.append(arr[idx]).append("\n");
            } else {
                sb.append(map.get(order)).append("\n");
            }
        }

        System.out.println(sb);
    }
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
