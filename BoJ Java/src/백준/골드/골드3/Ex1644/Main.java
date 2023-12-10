package 백준.골드.골드3.Ex1644;

import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer> makePrime(int n) {
        boolean[] isPrime = new boolean[n + 1];
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (isPrime[i]) {
                list.add(i);
            }
        }
        list.add(0);
        return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = makePrime(n);

        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int count = 0;
        while (p1 <= p2 && p2 < list.size()) {
            if (sum == n) {
                count++;
            }

            if (sum < n) {
                sum += list.get(p2++);
            } else {
                sum -= list.get(p1++);
            }
        }

        System.out.println(count);
    }

}