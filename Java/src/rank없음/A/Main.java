package rank없음.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String newStr = str.replaceAll("DKSH", "");
        System.out.println((str.length() - newStr.length())/4);
        System.out.println();
    }
}
