package 백준.브론즈.브론즈5.Ex3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] chess = {1, 1, 2, 2, 2, 8};

        for (int piece : chess) {
            sb.append(piece - Integer.parseInt(st.nextToken())).append(" ");
        }

        System.out.println(sb);
    }
}
