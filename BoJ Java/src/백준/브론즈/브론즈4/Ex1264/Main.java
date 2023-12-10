package 백준.브론즈.브론즈4.Ex1264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static char[] consonantUpper = {'A', 'E', 'I', 'O', 'U'};
    public static char[] consonantLower = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String text = br.readLine();
            if(text.equals("#")) {
                break;
            }

            int count = 0;
            for(int i = 0; i<text.length(); i++) {
                char c = text.charAt(i);
                for(int j = 0; j< consonantUpper.length; j++) {
                    if(c == consonantUpper[j] || c == consonantLower[j]) {
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
