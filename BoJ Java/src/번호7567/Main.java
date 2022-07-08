package 번호7567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int height = 10;
        Scanner sc = new Scanner(System.in);
        String inputDishes = sc.nextLine();
        char[] dishes = inputDishes.toCharArray();

        for(int i = 1; i<dishes.length; i++) {
            if(dishes[i-1] == dishes[i]) {
                height = height + 5;
            } else {
                height = height + 10;
            }
        }
        System.out.println(height);
    }
}
