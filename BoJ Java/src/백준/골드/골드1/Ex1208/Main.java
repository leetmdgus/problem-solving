package 백준.골드.골드1.Ex1208;

import java.io.*;
import java.util.*;

public class Main {
    static int N, S;
    static long[] arr;
    static List<Long> left = new ArrayList<>();
    static List<Long> right = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new long[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        getSubsequence(0, N / 2, 0, left);
        getSubsequence(N/2, N, 0, right);

        Collections.sort(left);
        Collections.sort(right);

        long cnt = getCnt();

        if (S == 0) {
            cnt--;
        }
        System.out.println(cnt);
    }

    public static void getSubsequence(int idx, int end, long sum, List<Long> list) {
        if (idx == end) {
            list.add(sum);
            return;
        }

        getSubsequence(idx + 1, end, sum + arr[idx], list);
        getSubsequence(idx + 1, end, sum, list);
    }

    public static long getCnt() {
        long cnt = 0;
        int p1 = 0;
        int p2 = right.size() - 1;


        while (p1 < left.size() && p2 >= 0) {
            long sum = left.get(p1) + right.get(p2);

            if (sum < S) {
                p1++;
            } else if (sum > S) {
                p2--;
            } else { // sum == S
                long a = left.get(p1);
                long cnt1 = 0;
                while (p1 < left.size() && left.get(p1) == a) {
                    p1++;
                    cnt1++;
                }

                long b = right.get(p2);
                long cnt2 = 0;
                while (p2 >= 0 && right.get(p2) == b) {
                    p2--;
                    cnt2++;
                }

                cnt += cnt1 * cnt2;
            }
        }

        return cnt;
    }
}