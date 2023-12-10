package 백준.실버.실버2.Ex6603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static final int CHOICE_COUNT = 6;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            if (k == 0) {
                break;
            }

            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                arrayList.add(Integer.parseInt(st.nextToken()));
            }

            ArrayList<Integer> arr = new ArrayList<>();
            lotto(arr, arrayList);
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static void lotto(ArrayList<Integer> arr, ArrayList<Integer> arrayList) {
        if (CHOICE_COUNT == arr.size()) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arr.size() != 0 && arr.get(arr.size() - 1) >= arrayList.get(i)) {
                continue;
            }

            arr.add(arrayList.get(i));
            lotto(arr, arrayList);
            arr.remove(arr.size() - 1);
        }
    }
}
