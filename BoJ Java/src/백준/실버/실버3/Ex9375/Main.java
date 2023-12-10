package 백준.실버.실버3.Ex9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        while(t-- > 0) {
            Map<String, Integer> map = new HashMap<>();

            int n = Integer.parseInt(br.readLine());
            for(int i = 0; i<n ;i++) {
                StringTokenizer st= new StringTokenizer(br.readLine());
                st.nextToken();
                String suit = st.nextToken();
                if(map.containsKey(suit)) {
                    map.put(suit, map.get(suit)+1);
                } else {
                    map.put(suit, 2);
                }
            }

            int res = 1;
            for(int val : map.values()) {
                res *= (val);
            }

            sb.append(res-1).append("\n");
        }

        System.out.println(sb);
    }
}
