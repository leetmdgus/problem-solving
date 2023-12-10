package 백준.실버.실버3.Ex15655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder answer = new StringBuilder();
    public static int n, m;
    public static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        array = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);
        solve(new int[m], 0, 0);
        System.out.println(answer);
    }

    public static void solve(int[] makeArr, int depth, int start) {
        if (makeArr.length == depth) {
            for(int i = 0; i<makeArr.length; i++) {
                answer.append(makeArr[i]).append(' ');
            }
            answer.append('\n');
            return;
        }

        for (int i = start; i < n; i++) {
            makeArr[depth] = array[i];
            solve(makeArr, depth+1, i+1);
        }
    }
}
