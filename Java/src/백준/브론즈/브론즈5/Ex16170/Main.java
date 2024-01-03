package 백준.브론즈.브론즈5.Ex16170;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        String[] now = LocalDate.now().toString().split("-");

        for(int i = 0; i<3; i++) {
            System.out.println(now[i]);
        }
    }
}
