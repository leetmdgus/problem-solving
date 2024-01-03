package 백준.골드.골드3.Ex16637;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    static int maxResult, N;
    static ArrayList<Character> operators;
    static ArrayList<Integer> numbers;
    static boolean[] isMerged;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(reader.readLine());
        String input = reader.readLine();

        if(N == 1) {
            System.out.println(input);
            return;
        }

        operators = new ArrayList<>();
        numbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            char currentChar = input.charAt(i);
            if (i % 2 == 0) {
                numbers.add(currentChar - '0');
            } else {
                operators.add(currentChar);
            }
        }

        maxResult = Integer.MIN_VALUE;
        for (int i = 1; i <= operators.size(); i++) {
            isMerged = new boolean[operators.size()];
            exploreCombinations(new int[i], 0, 0);
        }

        System.out.println(maxResult);
    }

    public static int evaluateExpression(int[] indices) {
        Deque<Integer> numbersStack = new LinkedList<>();
        Deque<Character> operatorStack = new LinkedList<>();

        numbersStack.add(numbers.get(0));

        int idx = 0;
        for (int i = 1; i < numbers.size(); i++) {
            numbersStack.add(numbers.get(i));
            operatorStack.add(operators.get(i - 1));

            if (idx < indices.length && i - 1 == indices[idx]) {
                int num1 = numbersStack.removeLast();
                int num2 = numbersStack.removeLast();
                char operator = operatorStack.removeLast();
                numbersStack.addLast(calculate(num2, num1, operator));
                idx++;
            }
        }

        while (!operatorStack.isEmpty()) {
            int num1 = numbersStack.removeFirst();
            int num2 = numbersStack.removeFirst();
            char operator = operatorStack.removeFirst();
            numbersStack.addFirst(calculate(num1, num2, operator));
        }

        return numbersStack.pop();
    }

    public static int calculate(int num1, int num2, char operator) {
        if (operator == '+') {
            return num1 + num2;
        } else if (operator == '-') {
            return num1 - num2;
        } else if (operator == '*') {
            return num1 * num2;
        } else return -1;
    }

    public static void exploreCombinations(int[] indices, int depth, int start) {
        if (depth == indices.length) {
            int result = evaluateExpression(indices);
            maxResult = Math.max(result, maxResult);
            return;
        }

        for (int i = start; i < operators.size(); i++) {
            if (i == 0 || !isMerged[i - 1]) {
                isMerged[i] = true;
                indices[depth] = i;
                exploreCombinations(indices, depth + 1, i + 1);
                isMerged[i] = false;
            }
        }
    }
}
