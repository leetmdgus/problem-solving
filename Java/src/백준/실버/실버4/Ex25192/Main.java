package 백준.실버.실버4.Ex25192;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        Set<String> name = new HashSet();
        while(n-- > 0) {
            String str = br.readLine();
            if(str.equals("ENTER")) {
                count += name.size();
                name = new HashSet<>();
                continue;
            }
            name.add(str);
        }
        count += name.size();

        System.out.println(count);
    }
}
