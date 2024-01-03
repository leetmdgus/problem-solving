package 백준.골드.골드3.Ex15659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    public static int[] arr, operand;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n ;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        operand = new int[4];

        for(int i = 0; i<4; i++) {
            int num = Integer.parseInt(st.nextToken());
            operand[i] = num;
        }

        dfs(new int[n-1], 0);
        System.out.println(max + "\n" + min);

    }

    // 0:+  1:-  2:*  3:/
    public static void dfs(int[] makeArr, int depth) {
        if(depth == makeArr.length) {
            int res = calcul(makeArr);
            max = Math.max(max, res);
            min = Math.min(min, res);
            return;
        }

        for(int i = 0; i<4; i++) {
            if(operand[i] > 0) {
                operand[i]--;
                makeArr[depth] = i;
                dfs(makeArr, depth+1);
                operand[i]++;
            }
        }
    }


    public static int calcul(int[] makeArr) {
        Deque<Integer> de1 = new ArrayDeque<>();
        Deque<Integer> de2 = new ArrayDeque<>();

        de1.addLast(arr[0]);
        for(int i = 1; i<n; i++) {
            int oper = makeArr[i-1];
            if(oper == 0 || oper == 1) {
                de1.addLast(arr[i]);
                de2.addLast(oper);
            } else if(oper == 2) {
                int num1 = de1.removeLast();
                int num2 = arr[i];
                de1.addLast(num1*num2);
            } else if(oper == 3) {
                int num1 = de1.removeLast();
                int num2 = arr[i];
                de1.addLast(num1/num2);
            }
        }

        int res = de1.removeFirst();
        while(!de1.isEmpty()) {
            int oper = de2.removeFirst();
            int num = de1.removeFirst();

            if(oper == 0) {
                res += num;
            } else if(oper == 1) {
                res -= num;
            }
        }
        return res;
    }
}
