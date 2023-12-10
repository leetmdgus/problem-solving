package 백준.실버.실버5.Ex1436;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        long num = 665;
        while (count > 0) {
            num++;
            String str = String.valueOf(num);

            if(str.contains("666")) {
                count--;
            }
        }

        System.out.println(num);
    }
}
