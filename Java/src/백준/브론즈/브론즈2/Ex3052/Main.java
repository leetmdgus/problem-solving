package 백준.브론즈.브론즈2.Ex3052;

import java.util.ArrayList;

public class Main{
    static void pick(int n, ArrayList<Integer> picked, int toPick) {
        if(toPick == 0) {
            printPicked(picked);
            return;
        }
        int smallest = picked.isEmpty() ? 0 : picked.get(picked.size()-1) + 1;
        for(int next = smallest; next < n; ++ next) {
            picked.add(next);
            pick(n, picked, toPick-1);
            picked.remove(picked.size()-1);
        }
    }
    static void printPicked(ArrayList<Integer> picked) {
        System.out.println(picked);
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        int n = 5;
        int toPick = 2;
        pick(n, a, toPick);
    }
}