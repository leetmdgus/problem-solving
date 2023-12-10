package 백준.브론즈.브론즈5.Ex10699;

import java.text.SimpleDateFormat; // SimpleDateFormat 임포트
import java.util.Date;
import java.util.Scanner; // Scanner 임포트

public class Ex10699 {
    // 필드
    static Scanner sc = new Scanner(System.in); // Scanner 생성

    public static void main(String[] args) {

        Date nowDate = new Date();
        System.out.println("포맷 지정 전 : " + nowDate);

        SimpleDateFormat sdm = new SimpleDateFormat("yyyy-mm-dd");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        //원하는 데이터 포맷 지정
        String strNowDate = sdm.format(nowDate);
        //지정한 포맷으로 변환
        System.out.println("포맷 지정 후 : " + strNowDate);

    }
}