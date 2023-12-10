package 백준.골드.골드2.Ex4195;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;

    static Map<String, Integer> indexes; // 새로운 이름 나올 때마다 넣어주고 인덱스 1증가
    static Map<String, Integer> counts; // 갯수 저장
    static ArrayList<String> parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int index = 0;
            N = Integer.parseInt(br.readLine());
            indexes = new HashMap<>();
            parent = new ArrayList<>();
            counts = new HashMap<>();

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String n1 = st.nextToken();
                String n2 = st.nextToken();

                if (!indexes.containsKey(n1)) {
                    indexes.put(n1, index++);
                    parent.add(n1);
                    counts.put(n1, 1);
                }
                if (!indexes.containsKey(n2)) {
                    indexes.put(n2, index++);
                    parent.add(n2);
                    counts.put(n2, 1);
                }

                union(n1, n2);
                sb.append(get(find(n1))).append('\n');
            }
        }

        System.out.println(sb);
    }

    public static int get(String str) {
        return counts.get(find(str));
    }

    public static String find(String n) {
        int index = indexes.get(n);

        if (parent.get(index).equals(n)) return n;
        else {
            parent.set(index, find(parent.get(index)));
            return find(parent.get(index));
        }
    }

    public static void union(String n1, String n2) {
        n1 = find(n1);
        n2 = find(n2);

        if(n1.equals(n2)) return;

        int cnt1 = counts.get(n1);
        int cnt2 = counts.get(n2);

        if (n1.compareTo(n2) < 1) {
            int index = indexes.get(n2);
            parent.set(index, n1);

            counts.put(n1, cnt1 + cnt2);
            counts.put(n2, 0);
        } else {
            int index = indexes.get(n1);
            parent.set(index, n2);

            counts.put(n1, 0);
            counts.put(n2, cnt1 + cnt2);
        }
    }
}
