package 백준.골드.골드1.Ex1450;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n;i ++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arrayList);



    }
}
