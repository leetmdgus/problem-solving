package 백준.실버.실버4.Ex1337;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        if (arrayList.size() == 1) {
            System.out.println(4);
            return;
        }

        Collections.sort(arrayList);

        int minAddData = 5;

        for (int p1 = 0; p1 < n; p1++) {
            int p2 = p1+1;
            int length = 1;
            int addData = 0;

            for (int j = 1; j < 5; j++) {
                if (p2 >= n) {
                    break;
                }

                length++;
                if (arrayList.get(p1) != arrayList.get(p2) - j) {
                    addData++;
                    continue;
                }
                p2++;
            }

            while (length < 5) {
                length++;
                addData++;
            }

            minAddData = Math.min(minAddData, addData);
        }

        System.out.println(minAddData);
    }
}
