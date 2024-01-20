package 코드포스.Codeforces_Round_920_Div3.A;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            XY pos1, pos2, pos3, pos4;
            StringTokenizer st = new StringTokenizer(br.readLine());
            pos1 = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            pos2 = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            pos3 = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            pos4 = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));


            sb.append(area(pos1, pos2, pos3, pos4)).append('\n');
        }
        System.out.println(sb);
    }

    static int area(XY p1, XY p2, XY p3, XY p4) {
        int minX = min(p1.x, p2.x, p3.x, p4.x);
        int maxX = max(p1.x, p2.x, p3.x, p4.x);
        int minY = min(p1.y, p2.y, p3.y, p4.y);
        int maxY = max(p1.y, p2.y, p3.y, p4.y);

        return Math.abs((maxX - minX) * (maxY - minY));
    }

    static int min(int a1, int a2, int a3, int a4) {
        return Math.min(a1, Math.min(a2, Math.min(a3, a4)));
    }

    static int max(int a1, int a2, int a3, int a4) {
        return Math.max(a1, Math.max(a2, Math.max(a3, a4)));
    }

    static class XY {
        int x, y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
