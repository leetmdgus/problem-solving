package 백준.브론즈.브론즈5.Ex5341;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringBuilder sb= new StringBuilder();
        ArrayList<Integer> pyramid = new ArrayList<>();

        pyramid.add(0);

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            if(n < pyramid.size()) sb.append(pyramid.get(n)).append("\n");
            else {
                for(int i = pyramid.size(); i<=n; i++) {
                    pyramid.add(i + pyramid.get(i-1));
                }
                sb.append(pyramid.get(n)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
