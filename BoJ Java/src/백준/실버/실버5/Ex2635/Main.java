package 백준.실버.실버5.Ex2635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());

        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int second = 1; second <= first; second++) {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(first);
            list.add(second);

            while (true) {
                int n = list.get(list.size() - 2) - list.get(list.size() - 1);
                if(n < 0) {
                    break;
                }
                list.add(n);
            }

            if(list.size() > max) {
                max = list.size();
                ans = list;
            }
        }

        System.out.println(max);
        for(int i = 0; i<ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
