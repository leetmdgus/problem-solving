package 백준.실버.실버5.Ex27964;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static Set<String> cheese = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String topping = st.nextToken();
            if (topping.endsWith("Cheese")) {
                cheese.add(topping);
            }
        }

        System.out.println(cheese.size() >= 4 ? "yummy" : "sad");
    }
}
