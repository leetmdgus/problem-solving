package 실버4.Ex10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack {
    int[] arr = new int[100000];
    int top;
    int sum;
    int size;

    Stack(){
        this.top = -1;
    }
    void push(int data) {
        size++;
        arr[++top] = data;
        sum+=data;
    }
    void zero() {
        size--;
        sum-=arr[top--];
    }

    void getSum(){
        System.out.println(sum);
    }
}

public class Ex10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        Stack stack = new Stack();
        while(repeat-->0) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                stack.zero();
            } else {
                stack.push(num);
            }
        }
        stack.getSum();
    }
}
