package 백준.실버.실버5.Ex26265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<String[]> heap = new PriorityQueue<>((o1, o2) -> {
            if(o1[0].equals(o2[0])) {
                return o2[1].compareTo(o1[1]);
            }
            return o1[0].compareTo(o2[0]);
        });

        for(int i = 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String mentor = st.nextToken();
            String mentee = st.nextToken();

            heap.add(new String[]{mentor, mentee});
        }

        StringBuilder sb = new StringBuilder();
        while(!heap.isEmpty()) {
            String[] m = heap.poll();
            sb.append(m[0] + " " + m[1]).append("\n");
        }

        System.out.println(sb);
    }
}
