package 백준.골드.골드5.Ex17089;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] friendMap = new boolean[N + 1][N + 1];
        int[] friendCnt = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            friendMap[a][b] = true;
            friendMap[b][a] = true;
            friendCnt[a]++;
            friendCnt[b]++;
        }

        int minFriendABC = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(i == j || !friendMap[i][j]) continue;

                for (int k = 1; k <= N; k++) {
                    if(i == k || j == k || !friendMap[i][k] || !friendMap[j][k]) continue;

                    int friendABC = 0;
                    friendABC += friendCnt[i] - 2;
                    friendABC += friendCnt[j] - 2;
                    friendABC += friendCnt[k] - 2;

                    minFriendABC = Math.min(minFriendABC, friendABC);
                }
            }
        }

        minFriendABC = minFriendABC == Integer.MAX_VALUE? -1 : minFriendABC;
        System.out.println(minFriendABC);
    }
}