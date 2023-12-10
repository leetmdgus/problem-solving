package 백준.실버.실버4.Ex10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Stack {
    int[] list;
    int top;
    int size;

    Stack(){
        list = new int[10001];
        top = -1;
    }
    void push(int data) {
        size++;
        list[++top] = data;
    }
    int pop() {
        if(isEmpty() == 1) {
            return -1;
        }
        size--;
        int result = list[top];
        top--;
        return result;
    }
    int size() {
        return size;
    }
    int isEmpty() {
        if(size == 0) {
            return 1;
        }
        return 0;
    }

    int getTop() {
        if(isEmpty() == 1) {
            return -1;
        }
        return list[top];
    }
}

public class Ex10828 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int repeat = Integer.parseInt(st.nextToken());

        Stack stack = new Stack();
        while(repeat-->0) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if(st.countTokens() == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            if(order.equals("pop")) {
                System.out.println(stack.pop());
            }else if(order.equals("size")) {
                System.out.println(stack.size());
            } else if(order.equals("empty")) {
                System.out.println(stack.isEmpty());
            } else if(order.equals("top")) {
                System.out.println(stack.getTop());
            }
        }
    }
}
