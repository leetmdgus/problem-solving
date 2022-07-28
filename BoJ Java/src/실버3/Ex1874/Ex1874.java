package 실버3.Ex1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        int currentNum = repeat;
        while(currentNum > 0) {
            if(repeat-- > 0) {
                int num = Integer.parseInt(br.readLine());
                stack.push(num);
                sb.append("+").append("\n");
            }
            if(!stack.isEmpty()) {
                if(stack.peek() == currentNum) {
                    stack.pop();
                    sb.append("-").append("\n");
                    currentNum--;
                }
            }
            if(repeat == 0) {
                if(stack.peek() != currentNum) {
                    break;
                }
            }
        }

        if(!stack.isEmpty()) {
            sb = new StringBuilder();
            sb.append("No");
        }

        System.out.println(sb);
    }
}
