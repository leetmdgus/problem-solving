package 백준.골드.골드5.Ex2166;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        XY[] arr = new XY[n + 1];
        for (int i = 0; i < n + 1; i++) arr[i] = new XY();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new XY(x, y);
        }

        arr[n].x = arr[0].x;
        arr[n].y = arr[0].y;

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long) arr[i].x * arr[i + 1].y - (long) arr[i + 1].x * arr[i].y;
        }
        sum = Math.abs(sum);
        String ans = String.format("%.1f", sum/2);
        System.out.printf(ans);
    }

    static class XY {
        int x, y;

        public XY() {
        }

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}