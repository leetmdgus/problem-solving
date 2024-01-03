package 코드포스.Codeforces_Round_918_Div4.D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String change = str;
            change = change.replace("a", "V");
            change = change.replace("e", "V");
            change = change.replace("b", "C");
            change = change.replace("c", "C");
            change = change.replace("d", "C");

            while(change.contains("CC")) {
                change = change.replace("CC", "C.C");
            }
            while(change.contains("CVCV")) {
                change = change.replace("CVCV", "CV.CV");
            }

            int idx1 = 0;
            for (int i = 0; i < str.length(); i++) {
                if(change.charAt(idx1) == '.') {
                    sb.append('.');
                    idx1++;
                }
                sb.append(str.charAt(i));
                idx1++;
            }

            sb.append('\n');
        }
        System.out.println(sb);
    }
}
