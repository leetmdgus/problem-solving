package 백준.브론즈.브론즈1.Ex1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] ans = br.readLine().split("");
        n--;
        while (n-- > 0) {
            String[] next = br.readLine().split("");
            for (int i = 0; i < ans.length; i++) {
                if(!ans[i].equals(next[i])) {
                    ans[i] = "?";
                }
            }
        }

        StringBuilder sb= new StringBuilder();
        for(int i = 0; i<ans.length; i++) {
            sb.append(ans[i]);
        }
        System.out.println(sb);
    }
}
