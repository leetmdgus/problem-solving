package 백준.브론즈.브론즈2.Ex2605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int vote = Integer.parseInt(st.nextToken());

            if(vote == 0) {
                list.add(i+1);
            } else {
                list.add(i-vote, i+1);
            }
        }

        for(int i = 0; i<n ;i ++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
