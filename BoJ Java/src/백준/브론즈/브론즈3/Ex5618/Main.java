package 백준.브론즈.브론즈3.Ex5618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long gcf = GCF(a, b);
        if(n == 3) {
            long c = Long.parseLong(st.nextToken());
            gcf = GCF(gcf, c);
        }

        getCF(gcf);
        System.out.println(sb);
    }

    public static long GCF(long a, long b) {
        if (b > a) {
            return GCF(b, a);
        }
        if (b == 0) {
            return a;
        }
        return GCF(b, a % b);
    }

    public static void getCF(long a) {
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                sb.append(i).append("\n");
            }
        }
    }
}
