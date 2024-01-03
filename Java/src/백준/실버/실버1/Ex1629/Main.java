package 백준.실버.실버1.Ex1629;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long a, b, c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        long result = pow(a, b);
        System.out.println(result);
    }

    public static long pow(long A, long exponent) {
        if(exponent == 1) {
            return A % c;
        }

        long tmp = pow(A, exponent/2);

        if(exponent%2 == 1) {
            return ((tmp * tmp %c) * (A % c)) %c;
        }

        return tmp * tmp % c;
    }
}
