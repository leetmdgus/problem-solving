package 백준.플래티넘.플래티넘4.Ex1422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<>();
        List<Long> listLong = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            listLong.add(Long.parseLong(br.readLine()));
        }

        listLong.sort(Comparator.reverseOrder());
        for(int i = 0; i<K ;i++) {
            list.add(String.valueOf(listLong.get(i)));
        }

        while (list.size() < N) {
            list.add(String.valueOf(listLong.get(0)));
        }

        list.sort((s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(list.get(i));
        }
        System.out.println(sb);

    }
}
