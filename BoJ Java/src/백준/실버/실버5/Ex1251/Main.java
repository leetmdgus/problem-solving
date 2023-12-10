package 백준.실버.실버5.Ex1251;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        ArrayList<String> list = new ArrayList<>();
        String[] st = new String[3];

        for(int i = 1; i<str.length()-1; i++) {
            for(int j = i+1; j<str.length(); j++) {
                st[0] = new StringBuilder(str.substring(0, i)).reverse().toString();
                st[1] = new StringBuilder(str.substring(i, j)).reverse().toString();
                st[2] = new StringBuilder(str.substring(j)).reverse().toString();

                StringBuilder sb = new StringBuilder();
                for(int k = 0; k<3; k++) {
                    sb.append(st[k]);
                }

                list.add(sb.toString());
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
