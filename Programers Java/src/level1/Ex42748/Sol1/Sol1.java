package level1.Ex42748.Sol1;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[array.length];

        for (int[] a : commands) {
            System.out.print("[");
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println("]");

        }

        for (int index = 0; index < array.length; index++) {
            int[] cloneArr = array.clone();

            // int i = commands[index][0]-1;
            // int j = commands[index][1]-1;
            // int k = commands[index][2]-1;
            // Arrays.sort(cloneArr, i, j+1);

            // answer[index] = cloneArr[k];
        }

        return answer;
    }
}



public class Sol1 {
    public static void main(String[] args) {
        Solution sol = new Solution();

    }

}
