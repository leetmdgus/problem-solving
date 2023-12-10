package 백준.실버.실버5.Ex1380;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        for(int scenario = 1; ; scenario++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            String[] nameList = new String[n + 1];

            for (int i = 1; i <= n; i++) {
                nameList[i] = br.readLine();
            }

            int[] confiscated = new int[n + 1];
            for (int i = 0; i < 2 * n - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                if (confiscated[num] == 1) {
                    confiscated[num] = 0;
                } else {
                    confiscated[num]++;
                }
            }

            for (int i = 1; i <= n; i++) {
                if(confiscated[i] == 1) {
                    sb.append(scenario + " " + nameList[i]).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
