package 백준.골드.골드4.Ex16120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'P') {
                stack.push('P');
            } else {
                if (stack.size() >= 2 && i < str.length() - 1 && str.charAt(i + 1) == 'P') {
                    stack.pop();
                    stack.pop();
                } else {
                    System.out.println("NP");
                    return;
                }
            }
        }

        if (stack.size() == 1) {
            System.out.println("PPAP");
        } else {
            System.out.println("NP");
        }
    }
}