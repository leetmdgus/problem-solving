package 백준.실버.실버2.Ex12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int p1 = 0;
        for (int i = 0; i < S; i++) {
            if (i < P) {
                char c = str.charAt(i);
                if (c == 'A') {
                    arr[0]--;
                } else if (c == 'C') {
                    arr[1]--;
                } else if (c == 'G') {
                    arr[2]--;
                } else if (c == 'T') {
                    arr[3]--;
                }
            } else {
                char prev = str.charAt(p1++);
                char curr = str.charAt(i);

                if (prev == 'A') {
                    arr[0]++;
                } else if (prev == 'C') {
                    arr[1]++;
                } else if (prev == 'G') {
                    arr[2]++;
                } else if (prev == 'T') {
                    arr[3]++;
                }

                if (curr == 'A') {
                    arr[0]--;
                } else if (curr == 'C') {
                    arr[1]--;
                } else if (curr == 'G') {
                    arr[2]--;
                } else if (curr == 'T') {
                    arr[3]--;
                }
            }

            if (i >= P -1) {
                boolean flag = true;
                for (int j = 0; j < 4; j++) {
                    if (arr[j] > 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
