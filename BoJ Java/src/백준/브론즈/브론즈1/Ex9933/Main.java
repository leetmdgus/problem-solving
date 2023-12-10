package 백준.브론즈.브론즈1.Ex9933;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String rs = new StringBuilder(s).reverse().toString();
            int length = s.length();

            ArrayList<String> list;

            if (map.containsKey(length)) {
                list = map.get(length);
            } else {
                list = new ArrayList();
            }

            list.add(s);
            map.put(length, list);
            list = map.get(length);

            for (int j = 0; j < list.size(); j++) {
                String str = list.get(j);
                if(str.equals(rs)) {
                    System.out.println(s.length() + " " + s.charAt(s.length()/2));
                    return;
                }
            }
        }
    }
}
