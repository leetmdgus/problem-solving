package 백준.브론즈.브론즈2.Ex2702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        while(t-- > 0) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int max = GCD(a, b);
            int min = a*b/max;

            answer.append(min).append(" ").append(max).append('\n');
        }
        System.out.println(answer);
    }
    public static int GCD(int a, int b) {
        return (b != 0) ? GCD(b, a%b) : a;
    }

}
