package 백준.브론즈.브론즈1.Ex1357;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        String reverseA = new StringBuilder(a).reverse().toString();
        String reverseB = new StringBuilder(b).reverse().toString();

        String sum = String.valueOf(Integer.parseInt(reverseA) + Integer.parseInt(reverseB));
        String reverseSum = new StringBuilder(sum).reverse().toString();

        System.out.println(Integer.parseInt(reverseSum));
    }
}
