package 백준.실버.실버4.Ex1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Set<Long> a = new HashSet<>();
        Set<Long> b = new HashSet<>();
        Set<Long> a_b = new HashSet<>();
        Set<Long> b_a = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cntA = Integer.parseInt(st.nextToken());
        int cntB = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< cntA; i++) {
            long n =Long.parseLong(st.nextToken());
            a.add(n);
            a_b.add(n);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<cntB; i++) {
            long n =Long.parseLong(st.nextToken());
            b.add(n);
            b_a.add(n);
        }

        a_b.removeAll(b);
        b_a.removeAll(a);

        int count = a_b.size() + b_a.size();
        System.out.println(count);
    }
}
