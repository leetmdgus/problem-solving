package 백준.골드.골드5.Ex25556;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        Stack<Integer> stack4 = new Stack<>();

        boolean flag = true;
        for (int i = 0; i < N; i++) {
            if(stack1.isEmpty() || stack1.peek() < arr[i]) stack1.add(arr[i]);
            else if(stack2.isEmpty() || stack2.peek() < arr[i]) stack2.add(arr[i]);
            else if(stack3.isEmpty() ||stack3.peek() < arr[i]) stack3.add(arr[i]);
            else if(stack4.isEmpty() || stack4.peek() < arr[i]) stack4.add(arr[i]);
            else flag = false;
        }

        if(flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
