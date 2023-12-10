package 백준.브론즈.브론즈3.Ex28289;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int grade1 = 0;
        int software = 0;
        int embedded = 0;
        int ai = 0;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int grade = Integer.parseInt(st.nextToken());

            if(grade == 1) {
                grade1++;
            } else {
                int c = Integer.parseInt(st.nextToken());

                if(c == 1 || c == 2) {
                    software++;
                } else if(c == 3) {
                    embedded++;
                } else if(c == 4) {
                    ai++;
                }
            }
        }

        System.out.println(software);
        System.out.println(embedded);
        System.out.println(ai);
        System.out.println(grade1);
    }
}
