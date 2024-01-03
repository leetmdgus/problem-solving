package 백준.실버.실버2.Ex16953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static long A, B;
    public static long min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        if(A == B) {
            System.out.println(0);
            return;
        }
        System.out.println(bfs());
    }

    public static long bfs() {
        Queue<long[]> q = new LinkedList<>();
        q.add(new long[]{A, 1});

        while (!q.isEmpty()) {
            long[] now = q.poll();

            for (int i = 0; i < 2; i++) {
                long[] next = new long[2];
                if (i == 0) {
                    next[0] = now[0] * 2;
                } else {
                    next[0] = now[0] * 10 + 1;
                }

                if(next[0] == B) {
                    return now[1] + 1;
                }
                if (next[0] > B) continue;

                next[1] = now[1] + 1;
                q.add(next);
            }
        }

        return -1;
    }
}
