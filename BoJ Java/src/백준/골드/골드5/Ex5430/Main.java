package 백준.골드.골드5.Ex5430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(n-- >0) {
            String order = br.readLine();
            int k = Integer.parseInt(br.readLine());
            String str = br.readLine().replace("[","").replace("]","");

            String answer = solution(order, str);
            sb.append(answer).append('\n');
        }

        System.out.println(sb);
    }

    public static String solution(String order, String str) {
        String[] arr = new String[1];
        if(str.contains(",")) {
            arr = str.split(",");
        } else if(str.equals("")){
            return(order.contains("D")) ? "error" : "[]";   // 비어있는 문자열일때 예외처리
        } else {        // , 가 없을때(요소가 하나일때) 예외처리
            arr[0] = str;
        }

        Deque<Integer> deque = new LinkedList<>();
        boolean isReverse = false;
        for(int i = 0; i<arr.length; i++) {
            deque.addLast(Integer.parseInt(arr[i]));
        }

        for(int i = 0; i<order.length(); i++) {
            if(order.charAt(i) == 'R') {
                isReverse = !isReverse;
            } else {
                if(deque.isEmpty()) {
                    return "error";
                }
                if(isReverse) {
                    deque.removeLast();
                } else {
                    deque.removeFirst();
                }
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append('[');
        if(!deque.isEmpty()) {  // 출력하는 과정에서 확인
            if(isReverse) {
                while(deque.size() != 1) {
                    answer.append(deque.removeLast()).append(',');
                }
                answer.append(deque.removeLast());
            } else {
                while(deque.size() != 1) {
                    answer.append(deque.removeFirst()).append(',');
                }
                answer.append(deque.removeFirst());
            }
        }
        answer.append(']');
        return answer.toString();
    }
}
