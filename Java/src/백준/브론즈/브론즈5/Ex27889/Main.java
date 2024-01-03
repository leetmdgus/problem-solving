package 백준.브론즈.브론즈5.Ex27889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, String> school = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        init();
        String str = br.readLine();
        System.out.println(school.get(str));
    }

    static void init() {
        school.put("NLCS", "North London Collegiate School");
        school.put("BHA", "Branksome Hall Asia");
        school.put("KIS", "Korea International School");
        school.put("SJA", "St. Johnsbury Academy");
    }
}
