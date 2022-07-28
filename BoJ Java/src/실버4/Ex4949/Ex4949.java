package 실버4.Ex4949;

import java.io.*;
import java.util.*;

public class Ex4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            char[] strArray = br.readLine().toCharArray();
            if(strArray.length <= 1) {
                break;
            }

            Stack<Character> bracket = new Stack();
            boolean isBalanced = true;
            for(char word : strArray) {
                if(word == '(' || word == '[') {
                    bracket.push(word);
                }
                else if(word == ')') {
                    if(bracket.isEmpty()) {
                        isBalanced = false;
                        break;
                    }
                    if(bracket.pop() != '(') {
                        isBalanced = false;
                        break;
                    }
                } else if(word == ']') {
                    if(bracket.isEmpty()) {
                        isBalanced = false;
                        break;
                    }
                    if(bracket.pop() != '[') {
                        isBalanced = false;
                        break;
                    }
                }
            }
            String answer = isBalanced && bracket.isEmpty() ? "yes" : "no";
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
