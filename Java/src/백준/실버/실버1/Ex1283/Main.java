package 백준.실버.실버1.Ex1283;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static boolean[] key = new boolean['Z' - 'A' + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] words = br.readLine().split(" ");
            Deque<String> deque = new ArrayDeque();

            boolean flag = false;
            for (int j = 0; j < words.length; j++) {
                if (flag) {
                    sb.append(words[j]).append(" ");
                    continue;
                }

                char c = words[j].charAt(0);
                int idx = String.valueOf(c).toUpperCase().charAt(0) - 'A';
                if (!key[idx]) {
                    key[idx] = true;

                    while (!deque.isEmpty()) {
                        sb.append(deque.removeFirst()).append(" ");
                    }

                    sb.append("[").append(c).append("]");
                    sb.append(words[j].substring(1));
                    sb.append(" ");

                    flag = true;
                } else {
                    deque.addLast(words[j]);
                }
            }

            if (!flag) {
                while (!deque.isEmpty()) {
                    String word = deque.removeFirst();
                    if(flag) {
                        sb.append(word).append(" ");
                        continue;
                    }

                    for (int j = 0; j < word.length(); j++) {
                        char c = word.charAt(j);
                        int idx = String.valueOf(c).toUpperCase().charAt(0) - 'A';
                        if(!flag && !key[idx]) {
                            key[idx] = true;
                            sb.append("[").append(c).append("]");
                            flag = true;
                        } else {
                            sb.append(c);
                        }
                    }
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
