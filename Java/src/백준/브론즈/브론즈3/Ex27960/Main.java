package 백준.브론즈.브론즈3.Ex27960;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int A, B;

    static Set<Integer> aSet = new TreeSet<>();
    static Set<Integer> bSet = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        init();

        boolean[] arrA = new boolean[1000];
        boolean[] arrB = new boolean[1000];

        Iterator<Integer> iter = aSet.iterator();
        while (iter.hasNext()) {
            arrA[iter.next()] = true;
        }

        iter = bSet.iterator();
        while (iter.hasNext()) {
            arrB[iter.next()] = true;
        }

        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            if ((arrA[(int) Math.pow(2, i)] && arrB[(int) Math.pow(2, i)]) || (!arrA[(int) Math.pow(2, i)] && !arrB[(int) Math.pow(2, i)])) continue;
            sum += Math.pow(2, i);
        }

        System.out.println(sum);
    }

    public static void init() {
        int a = A;
        for (int i = 9; i >= 0; i--) {
            if (a - Math.pow(2, i) >= 0) {
                aSet.add((int) Math.pow(2, i));
                a -= Math.pow(2, i);
            }
        }

        int b = B;
        for (int i = 9; i >= 0; i--) {
            if (b - Math.pow(2, i) >= 0) {
                bSet.add((int) Math.pow(2, i));
                b -= Math.pow(2, i);
            }
        }
    }
}
