package 실버1;

import java.io.*;
import java.util.StringTokenizer;

public class Ex1160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int orderCount = Integer.parseInt(st.nextToken());

        int[][] array = new int[height+1][height+1];

        for(int i = 1; i< height+1; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j =1; j<height+1; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sumArray = new int[height+1][height+1];
        for(int i = 1; i<height+1; i++) {
            for(int j = 1; j<height+1; j++) {
                sumArray[i][j] = sumArray[i][j-1] + sumArray[i-1][j] - sumArray[i-1][j-1] + array[i][j];
            }
        }

        while (orderCount-- >0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = sumArray[x2][y2] - sumArray[x1-1][y2] - sumArray[x2][y1-1] +sumArray[x1-1][y1-1];

            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}
