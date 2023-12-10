package 백준.브론즈.브론즈2.Ex13458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] classRoom = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            classRoom[i] = A;
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long count = 0;

        count += N;
        for (int i = 0; i < N; i++) {
            classRoom[i] -= B;
        }

        for (int i = 0; i < N; i++) {
            if(classRoom[i] > 0) {
                count += (classRoom[i] % C == 0) ? (classRoom[i] / C) : (classRoom[i] / C) + 1;
            }
        }

        System.out.println(count);
    }
}
