package 백준.골드.골드4.Ex15809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static int[] parent;
    static int[] cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) parent[i] = i;

        cnt = new int[N + 1];
        for (int i = 1; i <= N; i++) cnt[i] = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int state = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(state, a, b);
        }

        Set set = new HashSet();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (!set.contains(find(i)) && find(i) != 0) {
                set.add(find(i));
                list.add(cnt[i]);
            }
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        sb.append(set.size()).append('\n');
        for (int a : list) {
            sb.append(a).append(' ');
        }
        System.out.println(sb);
    }

    public static int find(int x) {
        if (x == parent[x]) return x;
        else {
            cnt[x] = cnt[find(parent[x])];
            return parent[x] = find(parent[x]);
        }
    }

    public static void union(int state, int x, int y) {
        x = find(x);
        y = find(y);

        if(x == y) return;

        if (state == 1) { // 동맹
            parent[Math.max(x, y)] = Math.min(x, y);
            cnt[x] = cnt[x] + cnt[y];
            cnt[y] = cnt[x];
        } else { /// 전쟁
            if (cnt[x] > cnt[y]) { // y 가 x의 속국
                parent[y] = x;
                cnt[x] -= cnt[y];

            } else if (cnt[x] < cnt[y]) {
                parent[x] = y;
                cnt[y] -= cnt[x];

            } else { // 멸망
                parent[x] = 0;
                parent[y] = 0;
                cnt[x] = 0;
                cnt[y] = 0;
            }
        }
    }
}
