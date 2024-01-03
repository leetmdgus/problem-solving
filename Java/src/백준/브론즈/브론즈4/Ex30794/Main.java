package 백준.브론즈.브론즈4.Ex30794;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int lv = Integer.parseInt(st.nextToken());
        String judgement = st.nextToken();

        if(judgement.equals("miss")) {
            lv *= 0;
        } else if(judgement.equals("bad")) {
            lv *= 200;
        } else if(judgement.equals("cool")) {
            lv *= 400;
        } else if(judgement.equals("great")) {
            lv *= 600;
        } else {
            lv *= 1000;
        }

        System.out.println(lv);
    }
}
