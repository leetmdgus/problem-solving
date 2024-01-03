package 백준.브론즈.브론즈5.Ex10699;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        format.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.println(format.format(date));
    }
}
