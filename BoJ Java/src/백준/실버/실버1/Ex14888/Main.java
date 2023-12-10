package 백준.실버.실버1.Ex14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    public static boolean[] isVisited;
    public static String[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        nums = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            nums[i] = st.nextToken();
        }

        String operators = "";
        st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        for(int i = 0; i<count; i++) {
            operators += "+";
        }
        count = Integer.parseInt(st.nextToken());
        for(int i = 0; i<count; i++) {
            operators += "-";
        }
        count = Integer.parseInt(st.nextToken());
        for(int i = 0; i<count; i++) {
            operators += "*";
        }
        count = Integer.parseInt(st.nextToken());
        for(int i = 0; i<count; i++) {
            operators += "/";
        }

        String[] operatorArr = operators.split("");
        isVisited = new boolean[operatorArr.length];
        dfs(new String[operatorArr.length], operatorArr, 0);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(String[] makeArr, String[] operators, int depth) {
        if(depth == makeArr.length) {
            int num = calculation(makeArr);
            max = Math.max(num, max);
            min = Math.min(num, min);
            return;
        }

        for(int i= 0; i< makeArr.length; i++) {
            if(!isVisited[i]) {
                isVisited[i] = true;
                makeArr[depth] = operators[i];
                dfs(makeArr, operators, depth+1);
                isVisited[i] = false;
            }
        }

    }


    public static int calculation(String[] operators) {
        int answer = 0;

        answer += Integer.valueOf(nums[0]);

        for(int index = 0; index < operators.length; index++) {
            String operator = operators[index];
            switch (operator) {
                case "+":
                    answer += Integer.valueOf(nums[index+1]);
                    break;
                case "-":
                    answer -= Integer.valueOf(nums[index+1]);
                    break;
                case "*":
                    answer *= Integer.valueOf(nums[index+1]);
                    break;
                case "/":
                    if(answer < 0) {
                        answer = (answer*-1) / Integer.valueOf(nums[index+1]) * -1;
                    } else {
                        answer /= Integer.valueOf(nums[index+1]);
                    }
                    break;
            }
        }

        return answer;
    }
}
