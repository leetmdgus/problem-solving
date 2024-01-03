package 백준.골드.골드5.Ex1599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static ArrayList<String> list = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            list.add(str);
        }

        // Collections클래스의 sort함수를 공부했더니 이런 응용문제 풀이가 가능하구나.
        // sort함수의 특징은 return 1하면 자리 바꿈. 0, -1하면 그대로.

        Collections.sort(list, (o1, o2) -> {
            String s1 = o1.replaceAll("ng", "-");
            String s2 = o2.replaceAll("ng", "-");

            if(s1.equals(s2)) return 0;

            int length = Math.min(s1.length(), s2.length());

            for (int i = 0; i < length; i++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                if(c1 != c2) {
                    return compareTo(c1, c2);
                }
            }

            return s1.length() - s2.length();
        });

        StringBuilder sb = new StringBuilder();
        for(String str : list) {
           sb.append(str).append('\n');
        }
        System.out.println(sb);
    }

    public static int compareTo(char a, char b) {
        char[] minsickLanguage = {'a', 'b', 'k', 'd', 'e', 'g', 'h', 'i', 'l', 'm', 'n', '-', 'o', 'p', 'r', 's', 't', 'u', 'w', 'y'};

        int aOrder = 0;
        int bOrder = 0;
        for (int i = 0; i < minsickLanguage.length; i++) {
            if(minsickLanguage[i] == a) {
                aOrder = i;
            }
            if(minsickLanguage[i] == b) {
                bOrder = i;
            }
        }

        return aOrder - bOrder;
    }
}
