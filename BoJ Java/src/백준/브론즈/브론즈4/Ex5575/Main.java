package 백준.브론즈.브론즈4.Ex5575;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            Time start = new Time(h, m, s);

            h = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());
            Time end = new Time(h, m, s);

            workTimeCal(start, end);
        }

        System.out.println(sb);
    }

    public static Time workTimeCal(Time start, Time end) {
        int h = end.h - start.h;
        int m = end.m - start.m;
        int s = end.s - start.s;

        if(s < 0) {
            m--;
            s += 60;
        }
        if(m < 0) {
            h--;
            m+= 60;
        }

        sb.append(h + " " + m + " " + s + "\n");
        return new Time(h, m, s);
    }

    static class Time {
        int h, m, s;

        public Time(int h, int m, int s) {
            this.h = h;
            this.m = m;
            this.s = s;
        }
    }
}
