package 백준.실버.실버4.Ex1764;

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

        Set<String> set = new HashSet<>();

        for(int i = 0; i<n; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>();
        for(int i = 0; i<m; i++) {
            String str = br.readLine();
            if(set.contains(str)) {
                list.add(str);
            }
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        for(int i = 0; i<list.size(); i++) {
            sb.append(list.get(i));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
