package 백준.실버.실버3.Ex11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Set<String> set = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= str.length() - i; j++) {
                set.add(str.substring(j, j+i));
            }
        }

        System.out.println(set.size());
    }
}
