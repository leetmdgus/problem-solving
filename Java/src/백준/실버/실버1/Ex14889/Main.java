package 백준.실버.실버1.Ex14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int sum = arr[i][j] + arr[j][i];
                arr[i][j] = sum;
                arr[j][i] = sum;
            }
        }

        dfs(new ArrayList<>(), 1);
        System.out.println(min);
    }

    static int min = Integer.MAX_VALUE;

    public static void dfs(ArrayList<Integer> list, int start) {
        if (list.size() == n / 2) {
            ArrayList startTeam = findStartTeam(list);
            min = Math.min(min, Math.abs(calculation(list) - calculation(startTeam)));

            return;
        }

        for (int i = start; i <= n; i++) {
            list.add(i);
            dfs(list, i + 1);
            list.remove(Integer.valueOf(i));
        }
    }

    static int calculation(ArrayList<Integer> list) {
        int team = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                team += arr[list.get(i)][list.get(j)];
            }
        }
        return team;
    }

    static ArrayList<Integer> findStartTeam(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean flag = true;
            for (int j = 0; j < list.size(); j++) {
                if(i == list.get(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                newList.add(i);
            }
        }

        return newList;
    }
}
