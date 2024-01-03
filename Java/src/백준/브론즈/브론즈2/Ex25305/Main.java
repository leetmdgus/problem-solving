package 백준.브론즈.브론즈2.Ex25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i<n; i++)  {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arrayList, Collections.reverseOrder());

        System.out.println(arrayList.get(x-1));
    }
}
