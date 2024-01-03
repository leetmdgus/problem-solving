package 백준.실버.실버4.Ex10825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class Score {
    String name;
    int korean;
    int english;
    int math;

    public Score(String name, String korean, String english, String math) {
        this.name = name;
        this.korean = Integer.parseInt(korean);
        this.english = Integer.parseInt(english);
        this.math = Integer.parseInt(math);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Score> heap = new PriorityQueue<>((o1, o2) -> {
            if(o1.korean == o2.korean) {
                if(o1.english == o2.english) {
                    if(o1.math == o2.math) {
                        return o1.name.compareTo(o2.name);
                    }
                    return o2.math - o1.math;
                }
                return o1.english - o2.english;
            }
            return o2.korean - o1.korean;
        });


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            heap.add(new Score(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken()));
        }

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i<n; i++) {
            answer.append(heap.poll().name).append('\n');
        }

        System.out.println(answer);
    }
}
