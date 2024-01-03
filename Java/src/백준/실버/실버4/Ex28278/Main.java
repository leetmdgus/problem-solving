package 백준.실버.실버4.Ex28278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int o = Integer.parseInt(st.nextToken());

            switch (o) {
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case 2:
                    if(stack.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(stack.pop()).append('\n');
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append('\n');
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 5:
                    if(stack.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(stack.peek()).append('\n');
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}
