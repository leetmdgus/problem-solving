package 백준.실버.실버2.Ex1406;


import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int n = Integer.parseInt(br.readLine());

        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();
        for(int i = 0; i<str.length(); i++) {
            left.add(String.valueOf(str.charAt(i)));
        }

        while(n-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch (order) {
                case "L":
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                    break;
                case "D":
                    if(!right.isEmpty()) {
                        left.push(right.pop());
                    }
                    break;
                case "B":
                    if(!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                case "P":
                    left.push(st.nextToken());
                    break;
            }
        }


        StringBuilder sb = new StringBuilder();
        while(!left.isEmpty()) {
            right.push(left.pop());
        }
        while(!right.isEmpty()) {
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}
