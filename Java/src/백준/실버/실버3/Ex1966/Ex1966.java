package 백준.실버.실버3.Ex1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int repeat = Integer.parseInt(st.nextToken());

        while (repeat-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Queue<Integer> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            queue.add(Integer.parseInt(st.nextToken()));

            int importLevel = 0;
            while (importLevel < 10) {
                importLevel++;
                for (int i = 0; i < queue.size(); i++) {


                }

            }
        }
    }
}
