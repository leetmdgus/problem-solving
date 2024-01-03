package 백준.실버.실버3.Ex11899;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().replaceAll("", " ");
        StringTokenizer st = new StringTokenizer(str, " ");

        Stack<String> stack = new Stack<>();
        int count = 0;

        while(st.hasMoreTokens()) {
            String s = st.nextToken();
            if (s.equals("(")) {
                stack.add("(");
            } else if (stack.isEmpty()) {
                count++;
            } else {
                stack.pop();
            }
        }
        count += stack.size();
        System.out.println(count);
    }
}
