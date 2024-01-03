package 프로젝트_오일러.문제1;

public class Main {
    public static void main(String[] args) {
        int N = 4_000_001;

        long[] fibo = new long[N];
        fibo[0] = 1;
        fibo[1] = 1;

        long sum = 0;
        for (int i = 2; ; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            if (fibo[i] > N) break;

            if (fibo[i] % 2 == 0) {
                sum += fibo[i];
            }

        }

        System.out.println(sum);

    }
}
