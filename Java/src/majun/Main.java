package majun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

// 마주니 쉬는날 계산기
public class Main {
    static final int DISCHARGE_YEAR = 2024;
    static final int DISCHARGE_MONTH = 6;
    static final int DISCHARGE_DATE = 25;

    public static void main(String[] args) {
        // 3일 일하고 2일 쉰다.


        isWork(2023, 3, 1);


        printD_day();
    }

    public static void printD_day() { // d-day계산
        // 전역일 2024-6-25 D-557
        Calendar based = new GregorianCalendar(DISCHARGE_YEAR, DISCHARGE_MONTH, DISCHARGE_DATE);
        Calendar current = new GregorianCalendar(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());

        long diffSec = (based.getTimeInMillis() - current.getTimeInMillis()) / 1000;
        long diffDays = diffSec / (24 * 60 * 60) + 1;

        if (diffDays >= 0) {
            System.out.println("전역까지 D-" + diffDays + " 입니다.");
        } else {
            System.out.println("전역을 축하드립니다. ");
        }
    }

    public static void isWork() {
        int year = LocalDate.now().getYear();
        int month = LocalDate.now().getMonthValue();
        int date = LocalDate.now().getDayOfMonth();

        isWork(year, month, date);
    }

    public static void isWork(int year, int month, int date) {
        boolean work = true;

        int basedYear = 2022;
        int basedMonth = 12;
        int basedDate = 14;

        Calendar c = new GregorianCalendar(year, month - 1, date);
        Calendar b = new GregorianCalendar(basedYear, basedMonth - 1, basedDate);

        long diffSec = (c.getTimeInMillis() - b.getTimeInMillis()) / 1000;
        long diffDays = diffSec / (60 * 60 * 24);

        int count = (int) (diffDays % 5);

        switch (count) {
            case 0:
            case 1:
            case 2:
                work = true;
                break;
            case 3:
            case 4:
                work = false;
                break;
        }

        if (work) {
            System.out.println(year + "년 " + month + "월 " + date + "일은 " + (count + 1) + "번째 일하는 날입니다.");
        } else {
            System.out.println(year + "년 " + month + "월 " + date + "일은 " + (count - 2) + "번째 쉬는 날입니다.");
        }
    }

}
