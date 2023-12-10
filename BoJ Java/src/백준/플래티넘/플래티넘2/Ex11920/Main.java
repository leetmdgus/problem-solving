package 백준.플래티넘.플래티넘2.Ex11920;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        st= new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            int el = Integer.parseInt(st.nextToken());
            heap.add(el);

            if(heap.size() > k) {
                sb.append(heap.poll()).append(" ");
            }
        }

        while(!heap.isEmpty()) {
            sb.append(heap.poll()).append(" ");
        }

        System.out.println(sb);
    }
}
