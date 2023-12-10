package 백준.실버.실버3.Ex27649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            boolean enterFlag = false;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(enterFlag){
                    sb.append(" ");
                }

                if (c == '<' || c == '>' || c == '(' || c == ')') {
                    if(i != 0 && !enterFlag) {
                        sb.append(" ");
                    }
                    sb.append(c);
                    enterFlag = true;
                } else if (c == '&' || c == '|') {
                    if(i != 0 && !enterFlag) {
                        sb.append(" ");
                    }
                    sb.append(""+c + c);
                    i++;
                    enterFlag = true;
                } else {
                    sb.append(c);
                    enterFlag = false;
                }
            }

            sb.append(" ");
        }
        System.out.println(sb);
    }
}
