package 백준.실버.실버3.Ex17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static Stack<Character> stack = new Stack<>();
    public static String str;
    public static boolean tagFlag;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '<' || c == '>') {
                if (c == '<') stackClear();
                tagFlag = !tagFlag;
                sb.append(c);
            } else if (tagFlag) {
                sb.append(c);
            } else if (c != ' ') {
                stack.add(c);
            } else {
                stackClear();
                sb.append(c);
            }
        }

        stackClear();
        System.out.println(sb);
    }

    public static void stackClear() {
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
    }
}