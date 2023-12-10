package 백준.골드.골드1.Ex11003;
// 시간 초과


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class A {
    int index;
    int value;

    A(int index, int value) {
        this.index = index;
        this.value = value;
    }
}

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int currentIndex = 0;

        PriorityQueue<A> heap = new PriorityQueue<>((o1, o2) -> {
            if(o2.value <= o1.value) {
                return 1;
            }
            return -1;
        });

        st = new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i= 0; i<N; i++) {
            heap.add(new A(i, Integer.parseInt(st.nextToken())));

            int idx = heap.peek().index;

            while(i >= L && idx <= currentIndex - L) {
                heap.poll();
                idx = heap.peek().index;
            }

            sb.append(heap.peek().value).append(" ");
            currentIndex++;
        }

        System.out.println(sb);
    }
}
