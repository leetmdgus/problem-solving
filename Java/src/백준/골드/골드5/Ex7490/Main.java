package 백준.골드.골드5.Ex7490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static String[] operand = {" ", "+", "-"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            dfs(n, new String[n-1], 0);
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static void dfs(int n, String[] makeArr, int depth) {
        if(makeArr.length == depth){
            if(isZero(n, makeArr)) {
                sb.append(1);
                for(int i = 2; i<=n ;i++) {
                    sb.append(makeArr[i-2]);
                    sb.append(i);
                }
                sb.append('\n');
            }
            return;
        }

        for(int i = 0; i<=2 ;i++) {
            makeArr[depth] = operand[i];
            dfs(n, makeArr, depth+1);
        }
    }

    public static boolean isZero(int n, String[] arr) {
        Deque<Integer> de1 = new ArrayDeque<>();
        Deque<String> de2 = new ArrayDeque<>();

        de1.addLast(1);
        for(int i = 2; i<=n; i++) {
            String oper = arr[i-2];

            if(oper.equals(" ")) {
                int num1 = de1.removeLast() * 10 + i;
                de1.addLast(num1);
            } else {
                de1.addLast(i);
                de2.addLast(oper);
            }
        }

        int res = de1.removeFirst();
        while(!de1.isEmpty() || !de2.isEmpty()) {
            int num = de1.removeFirst();
            String oper = de2.removeFirst();

            if(oper.equals("+")) {
                res += num;
            } else if(oper.equals("-")){
                res -= num;
            }
        }

        return (res == 0);
    }
}
