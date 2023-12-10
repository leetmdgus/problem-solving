package 백준.실버.실버4.Ex1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static Deque<Integer> deque = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 1; i<=n; i++) {
            deque.addLast(i);
        }

        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int idx = 0;
        int count = 0;
        while(idx < arr.length) {
            if(arr[idx] == deque.getFirst()) {
                deque.removeFirst();
                idx++;
                continue;
            }

            int rCount = 0;
            for(int i = 0; i<deque.size(); i++) {
                rCount++;
                int num = deque.removeLast();
                deque.addFirst(num);

                if(deque.getFirst() == arr[idx]) {
                    if(rCount > deque.size()/2) {
                        count += deque.size() - rCount;
                    } else {
                        count += rCount;
                    }
                    deque.removeFirst();
                    idx++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
