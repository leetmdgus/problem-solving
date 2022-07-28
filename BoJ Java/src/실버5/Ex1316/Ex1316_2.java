package 실버5.Ex1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1316_2 {
    static boolean isGroup(String word) {
        boolean arr[] = new boolean[26];
        for(int i = 0; i<word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if(!arr[index]) {
                arr[index] = true;
            } else if(arr[index] && word.charAt(i) != word.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        int count = 0;
        while(repeat-- > 0) {
            String word = br.readLine();
            if(isGroup(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
