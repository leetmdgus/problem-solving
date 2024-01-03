package 백준.골드.골드4.Ex13701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        BitSet set = new BitSet();

        StringBuilder sb= new StringBuilder();
        while(st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            if(!set.get(a)) {
                sb.append(a+ " ");
                set.set(a);
            }
        }
        System.out.println(sb);
    }
}
