package 백준.실버.실버4.Ex24060;

import java.io.*;
import java.util.*;

class Main {
    public static int K;
    public static int count = 0;
    public static int result = 0;

    public static void merge_sort(long[] temp, long[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(temp, arr, p, q);
            merge_sort(temp, arr, q + 1, r);
            merge(temp, arr, p, q, r);
        }
    }

    public static void merge(long temp[], long[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            // 합병할때 원소 하나하나 비교해서 정렬
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }

        while (i <= q) { // 왼쪽 배열 부분이 남는 경우
            temp[t++] = arr[i++];
        }
        while (j <= r) { // 오른쪽 배열 부분이 남는 경우
            temp[t++] = arr[j++];
        }

        i = p;
        t = 0;
        while (i <= r) { // 결과 저장
            long result = temp[t++];
            arr[i++] = result;
            count++;

            if (count == K) {
                System.out.println(result);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        long[] A = new long[N];
        long[] temp = new long[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(st.nextToken());
            A[i] = num;
            // temp[i] = num;
        }

        merge_sort(temp, A, 0, N - 1);

        if (count != K) {
            System.out.println(-1);
        }
    }
}
