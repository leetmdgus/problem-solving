package 백준.플래티넘.플래티넘5.Ex16496;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(st.nextToken());
        }

        list.sort((s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if (list.get(0).equals("0")) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (String num : list) {
            sb.append(num);
        }
        System.out.println(sb);
    }
}