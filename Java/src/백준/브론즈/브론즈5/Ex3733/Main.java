package 백준.브론즈.브론즈5.Ex3733;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s;
        while(sc.hasNext()){
            n = sc.nextInt();
            s = sc.nextInt();
            System.out.println(s/(n+1));
        }
    }
}