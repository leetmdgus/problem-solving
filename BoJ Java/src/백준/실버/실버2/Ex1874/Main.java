package 백준.실버.실버2.Ex1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int start = 0;
        while(n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            while(num > start) {
                stack.push(++start);
                sb.append('+').append('\n');
            }
            if(stack.peek() != num) {
                sb = new StringBuilder("NO");
                break;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}