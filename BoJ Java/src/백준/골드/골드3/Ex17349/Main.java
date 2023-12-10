package 백준.골드.골드3.Ex17349;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static ArrayList<int[]> list = new ArrayList<>();
    public static int baseMan = -1;
    public static boolean baseManFlag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        list.add(new int[]{0, 0});

        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.add(new int[]{b, a}); // 1번이 말한다 b가 1루수다 or 1루수가 아니다.
        }

        for (int lier = 1; lier <= 9; lier++) {
            whoFirstBaseman(lier);
        }

        System.out.println(baseMan);
    }

    public static void whoFirstBaseman(int lier) {
        int[] firstBaseman = new int[10];
        for (int i = 1; i <= 9; i++) {
            int b = list.get(i)[0];
            int a = list.get(i)[1];

            if (i == lier) {
                a = (a == 0) ? 1 : 0;
            }

            if (a == 0) {
                if (firstBaseman[b] > 0) {
                    return;
                }
                firstBaseman[b]--;
            } else {
                if (firstBaseman[b] < 0) {
                    return;
                }
                firstBaseman[b]++;
            }
        }

        int zeroCount = 0;
        int zeroSave = 0;
        int count = 0;
        int man = -1;

        for (int i = 1; i <= 9; i++) {
            if (firstBaseman[i] == 0) {
                zeroCount++;
                zeroSave = i;
            }

            if (firstBaseman[i] >= 1) {
                man = i;
                count++;
            }

            if (count >= 2) {
                return;
            }
        }

        if (zeroCount == 1) {
            man = zeroSave;
        }

        if (!baseManFlag) {
            baseMan = man;
            baseManFlag = true;
        } else if (baseManFlag) {
            baseMan = -1;
        }
    }
}
