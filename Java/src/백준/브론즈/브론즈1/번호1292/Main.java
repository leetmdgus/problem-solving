package 백준.브론즈.브론즈1.번호1292;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int sum = 0;
        int index = 0;
        for(int i = 0; i<= B+1; i++) {
            for(int j = 0; j<i; j++) {
                index++;
                if(index > B) {
                    System.out.println(sum);
                    return;
                }
                if(index >= A) {
                    sum += i;
                }
            }
        }
    }
}
