package 백준.골드.골드5.Ex11758;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        XY p1 = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        XY p2 = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        XY p3 = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        System.out.println(CCW(p1, p2, p3));

    }

    static int CCW(XY p1, XY p2, XY p3) {
        long res = (p2.x - p1.x) * (p3.y - p1.y) - (p2.y - p1.y) * (p3.x - p1.x);
        if (res > 0) {
            return 1;
        } else if (res == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    static class XY {
        int x, y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
