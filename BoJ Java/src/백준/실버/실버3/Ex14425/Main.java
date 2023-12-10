package 백준.실버.실버3.Ex14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set set = new HashSet();
        while(n-- > 0) {
            set.add(br.readLine());
        }

        int count = 0;
        while(m-- > 0) {
            String str = br.readLine();
            if(set.contains(str)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
