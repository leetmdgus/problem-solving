package 백준.골드.골드5.Ex1068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] nodes;
    public static int root, d, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        nodes = new int[n][n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == -1) {
                root = i;
            } else {
                nodes[num][i] = 1;
            }
        }

        d = Integer.parseInt(br.readLine());

        if(root != d) {
            delete(root, false);
            leafCount(root);
        }

        System.out.println(cnt);
    }

    public static void delete(int num, boolean flag) {
        for (int i = 0; i < nodes[num].length; i++) {
            if(nodes[num][i] == 1) {
                if(flag || i == d) {
                    nodes[num][i] = 0;
                    delete(i, true);
                } else {
                    delete(i, false);
                }
            }
        }
    }

    public static void leafCount(int num) {
        int child = 0;

        for(int i = 0; i<nodes[num].length; i++) {
            if(nodes[num][i] == 1) {
                child++;
                leafCount(i);
            }
        }

        if(child == 0) {
            cnt++;
        }
    }
}
