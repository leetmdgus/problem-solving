//package 백준.골드.골드1.Ex13460;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class Main {
//    static int N, M;
//    static char[][] board;
//    static Queue<XY[]> q = new LinkedList<>();
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//
//        int tryCnt = 1;
//        while (tryCnt <= 10) {
//
//
//        }
//
//        System.out.println(-1);
//    }
//
//    static boolean move() {
//        while (!q.isEmpty()) {
//            XY[] now = q.poll();
//
//            XY[] next = up(now);
//
//            next = down(now);
//
//        }
//    }
//
//    static boolean isValid(XY[] now) {
//        if (now[0].x < 0 || now[0].y < 0 || now[0].x >= M || now[0].y >= N) return false;
//        if (now[1].x < 0 || now[1].y < 0 || now[1].x >= M || now[1].y >= N) return false;
//
//
//    }
//
//    static XY[] up(XY[] now) {
//        XY red = new XY(now[0].x, now[0].y);
//        XY blue = new XY(now[0].x, now[0].y);
//
//
//        return new XY[]{red, blue};
//    }
//
//    static XY[] down(XY[] now) {
//        XY red = new XY(now[0].x, now[0].y);
//        XY blue = new XY(now[0].x, now[0].y);
//
//        return new XY[]{red, blue};
//    }
//
//    static XY[] left(XY[] now) {
//        XY red = new XY(now[0].x, now[0].y);
//        XY blue = new XY(now[0].x, now[0].y);
//
//        return new XY[]{red, blue};
//    }
//
//    static XY[] right(XY[] now) {
//        XY red = new XY(now[0].x, now[0].y);
//        XY blue = new XY(now[0].x, now[0].y);
//
//        return new XY[]{red, blue};
//    }
//
//
//    static class XY {
//        int x, y;
//
//        public XY(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//}
