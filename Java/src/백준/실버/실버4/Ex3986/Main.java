package 백준.실버.실버4.Ex3986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        while(n-- > 0) {
            Stack<String> stack = new Stack<>();
            String[] word = br.readLine().split("");

            for(int i = 0; i<word.length; i++ ) {
                String c = word[i];
                if(stack.size() == 0) {
                    stack.add(word[i]);
                    continue;
                }

                if(stack.peek().equals(c)) {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            }

            if(stack.size() == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
