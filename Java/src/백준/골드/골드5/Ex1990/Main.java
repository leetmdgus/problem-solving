package 백준.골드.골드5.Ex1990;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] isPrime = new boolean[100_000_001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        eratosthenes();

        StringBuilder sb = new StringBuilder();
        for (int i = a; i <= b; i++) {
            if (!isPrime[i] && isPalindrome(i)) {
                sb.append(i).append("\n");
            }
        }
        sb.append(-1);

        System.out.println(sb);
    }

    public static void eratosthenes() {
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i * i <= 100_000_000; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= 100_000_000; j += i) {
                    isPrime[j] = true;
                }
            }
        }
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
