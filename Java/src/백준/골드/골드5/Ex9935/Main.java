package 백준.골드.골드5.Ex9935;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str1.length(); i++) {
            stack.push(str1.charAt(i));

            if (stack.size() >= str2.length()) {
                boolean flag = true;

                for (int j = 0; j < str2.length(); j++) {
                    if(stack.get(stack.size() - str2.length() + j) != str2.charAt(j)) {
                        flag = false;
                    }
                }

                if(flag) {
                    for(int j = 0; j<str2.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }

        StringBuilder sb= new StringBuilder();
        for(char c : stack) {
            sb.append(c);
        }
        System.out.println(sb.length() == 0 ? "FRULA" : sb);
    }
}