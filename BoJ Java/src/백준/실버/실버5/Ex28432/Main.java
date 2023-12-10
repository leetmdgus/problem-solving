package 백준.실버.실버5.Ex28432;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        if(n == 1) {
            br.readLine();
            br.readLine();
            System.out.println(br.readLine());
            return;
        }

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            list.add(str);
            set.add(str);
        }

        String firstWord = "";
        String lastWord = "";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("?")) {
                if (i != 0)
                    firstWord = String.valueOf(list.get(i - 1).toCharArray()[list.get(i - 1).length() - 1]);
                if (i != list.size() - 1)
                    lastWord = String.valueOf(list.get(i + 1).toCharArray()[0]);
                break;
            }
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (!set.contains(str)) {
                String[] strArr = str.split("");
                if (firstWord.equals("") && strArr[str.length() - 1].equals(lastWord)) {
                    System.out.println(str);
                } else if (lastWord.equals("") && strArr[0].equals(firstWord)) {
                    System.out.println(str);
                } else if (strArr[0].equals(firstWord) && strArr[str.length() - 1].equals(lastWord)) {
                    System.out.println(str);
                }
            }
        }

    }
}