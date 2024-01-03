package 백준.골드.골드2.Ex1377;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        for(int i = 0; i<n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        bubbleSort(a);
    }

    private static void bubbleSort(int[] arr) {
        int N = arr.length;
        boolean changed = false;
        for (int i=1; i<=N+1; i++) {
            changed = false;
            for (int j=0; j<N-i; j++) {
                if (arr[j] > arr[j+1]) {
                    changed = true;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            if (changed == false) {
                System.out.println(i);
                return;
            }
        }
    }
}
