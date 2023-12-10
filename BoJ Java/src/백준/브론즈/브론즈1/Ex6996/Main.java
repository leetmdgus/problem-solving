package 백준.브론즈.브론즈1.Ex6996;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (a.length() != b.length()) {
                sb.append(a + " & " + b + " are NOT anagrams.").append("\n");
                continue;
            }

            String[] aArr = a.split("");
            String[] bArr = b.split("");

            Arrays.sort(aArr);
            Arrays.sort(bArr);

            boolean flag = true;
            for (int i = 0; i < aArr.length; i++) {
                if (!aArr[i].equals(bArr[i])) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sb.append(a + " & " + b + " are anagrams.").append("\n");
            } else {
                sb.append(a + " & " + b + " are NOT anagrams.").append("\n");
            }
        }

        System.out.println(sb);
    }
}
