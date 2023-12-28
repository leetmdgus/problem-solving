package 코드포스.Codeforces_Round_918_Div4.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            for (int i = 0; i < 3; i++) {
                String[] arr = br.readLine().split("");
                String zero = arr[0];
                String one = arr[1];
                String two = arr[2];

                if (!zero.equals("?") && !one.equals("?") && !two.equals("?")) continue;

                String ABC = "ABC";
                ABC = ABC.replace(zero, "");
                ABC = ABC.replace(one, "");
                ABC = ABC.replace(two, "");
                sb.append(ABC).append('\n');
            }
        }
        System.out.println(sb);
    }
}
