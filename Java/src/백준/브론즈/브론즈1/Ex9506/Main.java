package 백준.브론즈.브론즈1.Ex9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            perfectNum(n);
        }
        System.out.println(sb);
    }

    public static void perfectNum(int n) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                list.add(i);
                sum += i;
            }
        }

        if(sum != n) {
            sb.append(n + " is NOT perfect.").append('\n');
        } else {
            sb.append(sum + " = ");
            for(int i = 0; i<list.size()-1; i++) {
                sb.append(list.get(i) + " + ");
            }
            sb.append(list.get(list.size()-1)).append('\n');
        }
    }
}
