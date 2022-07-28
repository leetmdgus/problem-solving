package 실버3.Ex3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] array = new int[length];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int count = 0;
        int start = 0;
        int end = length-1;
        while(start < end) {
            int sum = array[start] + array[end];

            if(sum == S) {
                count++;
            }

            if(sum <= S) {
                start++;
            }

        }
        System.out.println(count);
    }
}
