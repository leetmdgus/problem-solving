package 백준.실버.실버5.Ex10867;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0; i<n ;i++) {
            int num = Integer.parseInt(st.nextToken());
            if(!list.contains(num)) {
                list.add(num);
            }
        }

        Collections.sort(list);

        StringBuilder sb= new StringBuilder();
        for(int i = 0; i<list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
