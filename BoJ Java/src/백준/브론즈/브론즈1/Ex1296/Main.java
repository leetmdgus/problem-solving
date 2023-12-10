package 백준.브론즈.브론즈1.Ex1296;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Love yd;

    static TreeMap<Integer, PriorityQueue<String>> map = new TreeMap<>(Comparator.reverseOrder());

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ydStr = br.readLine();
        yd = toLove(ydStr);

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int p = percentage(str);
            if (!map.containsKey(p)) {
                map.put(p, new PriorityQueue<>());
            }
            map.get(p).add(str);
        }

        System.out.println(map.firstEntry().getValue().poll());
    }

    public static Love toLove(String str) {
        Love love = new Love(0, 0, 0, 0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') love.l++;
            if (str.charAt(i) == 'O') love.o++;
            if (str.charAt(i) == 'V') love.v++;
            if (str.charAt(i) == 'E') love.e++;
        }

        return love;
    }

    public static int percentage(String str) {
        Love n = toLove(str);

        int L = n.l + yd.l;
        int O = n.o + yd.o;
        int V = n.v + yd.v;
        int E = n.e + yd.e;

        return ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
    }

    static class Love {
        int l, o, v, e;

        public Love(int l, int o, int v, int e) {
            this.l = l;
            this.o = o;
            this.v = v;
            this.e = e;
        }
    }
}
