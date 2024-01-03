package 백준.실버.실버3.Ex20126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = arr[i][0] + Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        if (arr[0][0] >= m) {
            System.out.println(0);
            return;
        }

        int use = 0;
        int index = 0;

        while (true) {
            int nextIndex = index + 1;

            if (nextIndex == arr.length) {
                if (s - (arr[arr.length - 1][1]) < m) {
                    use = -1;
                } else {
                    use = arr[index][1];
                }
                break;
            }

            int diff = arr[nextIndex][0] - arr[index][1];
            if (diff >= m) {
                use = arr[index][1];
                break;
            }
            index++;
        }

        System.out.println(use);
    }
}
