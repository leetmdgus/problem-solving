package 백준.골드.골드4.Ex1889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[] receiveCnt;
    static ArrayList<Integer>[] arr;
    static boolean[] attendArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        receiveCnt = new int[n + 1];
        arr = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                int a = Integer.parseInt(st.nextToken());
                arr[i].add(a);
                receiveCnt[a]++;
            }
        }

        attendArr = new boolean[n + 1];
        Arrays.fill(attendArr, true);

        topologicalSort();

        int cnt = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if(attendArr[i]) {
                cnt++;
                ans.append(i + " ");
            }
        }

        System.out.println(cnt);
        System.out.println(ans);
    }

    static void topologicalSort() {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (receiveCnt[i] < 2) {
                q.add(i);
                attendArr[i] = false;
            }
        }

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int next : arr[now]) {
                receiveCnt[next]--;
                if(!attendArr[next]) continue;

                if (receiveCnt[next] < 2) {
                    attendArr[next] = false;
                    q.add(next);
                }
            }
        }
    }
}
