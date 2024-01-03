package 백준.실버.실버5.Ex11536;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> increasingList = new ArrayList<>();
        ArrayList<String> decreasingList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            list.add(str);
            increasingList.add(str);
            decreasingList.add(str);
        }

        Collections.sort(increasingList);
        Collections.sort(decreasingList, Collections.reverseOrder());

        boolean increasingFlag = true;
        boolean decreasingFlag = true;

        for (int i = 0; i < n; i++) {
            if(!increasingList.get(i).equals(list.get(i))) {
                increasingFlag = false;
            }
            if(!decreasingList.get(i).equals(list.get(i))) {
                decreasingFlag = false;
            }
        }


        if(increasingFlag) {
            System.out.println("INCREASING");
        } else if(decreasingFlag) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }

    }
}
