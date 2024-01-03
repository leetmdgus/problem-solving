package 백준.실버.실버4.Ex17219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i<n ;i++) {
            String[] strArr = br.readLine().split(" ");
            map.put(strArr[0], strArr[1]);
        }

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j<m; j++) {
            String str = br.readLine();
            sb.append(map.get(str)).append("\n");
        }
        System.out.println(sb);
    }
}
