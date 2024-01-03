package 백준.브론즈.브론즈2.Ex10093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long min = Math.min(a, b);
        long max = Math.max(a, b);

        sb.append(max - min - 1 < 0 ? 0 : max - min - 1).append('\n');
        for (long i = min + 1; i < max; i++) {
            sb.append(i).append(' ');
        }

        System.out.println(sb);
    }
}
