package 백준.플래티넘.플래티넘2.Ex17081;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        User users;


        StringTokenizer st = new StringTokenizer(br.readLine)
                st.hasMoreElements()
    }
}

class User {
    int hp =20, att=2, def=2, exp;
    int maxHp=20, maxExp=5;

    int level = 1;
    int weapon;
    int armor;
    Set<String> rings = new HashSet<>();


    void printState() {
        System.out.println("LV : " + level);
        System.out.println("HP : " + hp +"/"+maxHp);
        System.out.println("ATT : " + att + "+" + weapon);
        System.out.println("DEF : " + def + "+" + armor);
        System.out.println("EXP : " + exp + "/" + maxExp);
    }


}
