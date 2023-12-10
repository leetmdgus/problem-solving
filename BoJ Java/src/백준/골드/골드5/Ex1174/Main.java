package 백준.골드.골드5.Ex1174;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static long num = -1;
    public static int count;
    public static boolean flag;
    public static StringBuilder ans = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 10; i++) {
            if (!flag) {
                dfs(new int[i], 0);
            }
        }

        System.out.println(num);
    }

    public static void dfs(int[] arr, int depth) {
        if (arr.length == depth) {
            count++;
            if(count == n) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < arr.length; i++) {
                    sb.append(arr[i]);
                }
                num = Long.parseLong(sb.toString());
                flag = true;
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (depth == 0) {
                arr[depth] = i;
                dfs(arr, depth + 1);
            } else if (arr[depth - 1] > i) {
                arr[depth] = i;
                dfs(arr, depth + 1);
            }
        }
    }
}

