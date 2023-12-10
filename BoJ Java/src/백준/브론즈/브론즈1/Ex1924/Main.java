package 백준.브론즈.브론즈1.Ex1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static final int[] DATE = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String[] DAYS = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int date = Integer.parseInt(st.nextToken());

        System.out.println(findDay(month, date));
    }

    public static String findDay(int month, int date) {
        int day = date;

        for(int i = 0; i<month; i++) {
            day += DATE[i];
        }

        return DAYS[day%7];
    }
}
