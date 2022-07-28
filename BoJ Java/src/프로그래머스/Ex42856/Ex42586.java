package 프로그래머스.Ex42856;

import java.util.*;


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();

        int programCount = progresses.length;

        ArrayList<Integer> array = new ArrayList<>();

        int dailyCount = 0;
        while(true) {
            dailyCount = 0;
            for(int i = 0; i<programCount; i++) {
                if(progresses[i] < 100) {
                    queue.add(progresses[i] + speeds[i]);
                }
            }
            for(int i = 0; i<programCount; i++) {
                if(queue.peek() >= 100) {
                    dailyCount++;
                }

                queue.poll();
            }
            if(queue.isEmpty()) {
                break;
            }
            array.add(dailyCount);
        }

        System.out.println(array);
        for(int i = 0; i< array.size(); i++) {
            answer[i] = array.get(i);
        }
        return answer;
    }
}


public class Ex42586 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] progresses ={93, 30, 55};
        int[] speed = {1, 30, 5};
        sol.solution(progresses, speed);
    }
}
