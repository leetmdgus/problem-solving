package 백준.브론즈.브론즈5.Ex28927;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = (Integer.parseInt(st.nextToken()) * 3) + (Integer.parseInt(st.nextToken()) * 20) + (Integer.parseInt(st.nextToken()) * 120);

        st = new StringTokenizer(br.readLine());
        int d = (Integer.parseInt(st.nextToken()) * 3) + (Integer.parseInt(st.nextToken()) * 20) + (Integer.parseInt(st.nextToken()) * 120);

        if(m > d) {
            System.out.println("Max");
        } else if(m == d){
            System.out.println("Draw");
        } else {
            System.out.println("Mel");
        }
    }
}
