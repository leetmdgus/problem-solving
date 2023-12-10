package 백준.실버.실버1.Ex14888_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nums = new int[N + 1];
        operators = new int[5];
        order = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) nums[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 4; i++) operators[i] = Integer.parseInt(st.nextToken());

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    static int N, max, min;
    static int[] nums, operators, order;

    static void rec_func(int k, int value) {
        if (k == N) {
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {
            for (int cand = 1; cand <= 4; cand++) {
                if (operators[cand] >= 1) {
                    operators[cand]--;
                    order[k] = cand;
                    int new_value = calculate(value, cand, nums[k + 1]);

                    rec_func(k + 1, new_value);
                    operators[cand]++;
                    order[k] = 0;
                }
            }
        }
    }

    public static int calculate(int operand1, int operator, int operand2) {
        if      (operator == 1) return operand1 + operand2;
        else if (operator == 2) return operand1 - operand2;
        else if (operator == 3) return operand1 * operand2;
        else                    return operand1 / operand2;
    }

    public static void main(String[] args) throws IOException {
        input();

        rec_func(1, nums[1]);
        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());
    }
}