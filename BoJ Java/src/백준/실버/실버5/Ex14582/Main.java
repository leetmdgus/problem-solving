package 백준.실버.실버5.Ex14582;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer jem = new StringTokenizer(br.readLine());
        StringTokenizer gul = new StringTokenizer(br.readLine());

        boolean jemFlag = false;

        int jScore = 0;
        int gScore = 0;

        for (int i = 0; i < 18; i++) {
            if(i %2 == 0) {
                jScore += Integer.parseInt(jem.nextToken());
            } else {
                gScore += Integer.parseInt(gul.nextToken());
            }
            if(jScore > gScore) {
                jemFlag = true;
            }
        }

        if(jScore < gScore && jemFlag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
