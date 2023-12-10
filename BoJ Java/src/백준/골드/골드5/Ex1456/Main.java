package 백준.골드.골드5.Ex1456;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int max = 10_000_000;
    public static boolean[] isNotPrime = new boolean[max + 1];
    public static long a, b;
    public static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());

        setPrime();
        closelyPrime();
        System.out.println(count);

    }

    public static void setPrime() {
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i * i <= max; i++) { // 중요..!
            for (int j = i * i; j <= max; j += i) {
                isNotPrime[j] = true;
            }
        }
    }

    public static void closelyPrime() {
        for (int i = 2; i <= max; i++) {
            if (isNotPrime[i]) continue;

            for (int j = 2; ; j++) {
                if ((long) Math.pow(i, j) > b) break;
                if (((long) Math.pow(i, j) >= a)) count++;
            }
        }
    }
}
