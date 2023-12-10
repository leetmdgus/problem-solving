package 백준.골드.골드5.Ex1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static char[] word;
    public static boolean[] visited;
    public static int L;
    public static int C;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());


        word = new char[C];
        visited = new boolean[C];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<C; i++) {
            word[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(word);

        securitySystem(new char[L], 0, 0);

        System.out.println(sb);
    }

    public static void securitySystem(char[] arr, int depth, int start) {
        if (arr.length == depth) {
            int count = aeiouCount(arr);
            if (count >= 1 &&  L - count >= 2) {
                for (char c : arr) {
                    sb.append(c);
                }
                sb.append('\n');
            }
            return;
        }

        for (int i = start; i < C; i++) {
            arr[depth] = word[i];
            securitySystem(arr,  depth+1, i+1);
        }
    }

    public static int aeiouCount(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' | arr[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}