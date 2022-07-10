package 번호2490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex2490 {
    static int calculBack(String[] arr) {
        int back = 0;
        for(String zeroOrOne: arr) {
            if(zeroOrOne.equals("0")) {
                back++;
            }
        }
        return back;
    }
    static void printResult(int back) {
        char[] resultList = {'A', 'B', 'C', 'D', 'E'};
        if(back == 0) {
            System.out.println('E');
        } else {
            System.out.println(resultList[back-1]);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<3; i++) {
            String[] one = br.readLine().split(" ");
            int back = calculBack(one);
            printResult(back);
        }
    }
}
