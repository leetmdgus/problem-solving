package 백준.브론즈.브론즈3.Ex9063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //점의 개수

        XY xy1 = null, xy2 = null; //위왼 아래오
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int dot1 = Integer.parseInt(st.nextToken());
            int dot2 = Integer.parseInt(st.nextToken());

            if (xy1 == null) xy1 = new XY(dot1, dot2);
            else {
                if(dot1 < xy1.x) xy1.x = dot1;
                if(dot2 > xy1.y) xy1.y = dot2;
            }
            if (xy2 == null) xy2 = new XY(dot1, dot2);
            else {
                if(dot1 > xy2.x) xy2.x = dot1;
                if(dot2 < xy2.y) xy2.y = dot2;
            }
        }

        System.out.println(Math.abs(xy2.x - xy1.x) * Math.abs(xy2.y - xy1.y));
    }

    static class XY {
        int x, y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
