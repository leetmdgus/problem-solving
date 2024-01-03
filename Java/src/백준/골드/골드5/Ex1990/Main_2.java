package 백준.골드.골드5.Ex1990;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        boolean[] isNotPrime = new boolean[max+1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for(int i = 2; i<=max; i++){
            for(int j = i+i; j<=max; j+=i) {
                isNotPrime[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = min; i<=max; i++) {
            if(!isNotPrime[i] && isPalindrome(i)) {
                sb.append(i).append('\n');
            }
        }
        sb.append(-1);
        System.out.println(sb);
    }

    public static boolean isPalindrome(int num) {
        String word = Integer.toString(num);
        for(int i = 0; i<word.length()/2; i++) {
            if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
