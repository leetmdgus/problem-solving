package 백준.플래티넘.플래티넘5.Ex5373;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[] cube = new char[55];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

//        while (t-- > 0) {
//            init();
//            int n = Integer.parseInt(br.readLine());
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int i = 0; i < n; i++) {
//                String order = st.nextToken();
//
//                switch (order) {
//                    case "U+" :
//                        clockWiseU();
//                        break;
//                    case "U-" :
//                        counterClockWiseU();
//                        break;
//                    case "D+":
//                        clockWiseD();
//                        break;
//                    case "D-":
//                        counterClockWiseD();
//                        break;
//                    case "F+":
//                        clockWiseF();
//                        break;
//                    case "F-":
//                        counterClockWiseF();
//                        break;
//                    case "B+":
//                        clockWiseB();
//                        break;
//                    case "B-" :
//                        counterClockWiseB();
//                        break;
//                    case "L+":
//                        clockWiseL();
//                        break;
//                    case "L-":
//                        counterClockWiseL();
//                        break;
//                    case "R+":
//                        clockWiseR();
//                        break;
//                    case "R-":
//                        counterClockWiseR();
//                        break;
//                }
//            }
//            printU();
//        }

        init();
        counterClockWiseF();
        printU();
    }

    public static void init() {
        for (int i = 1; i <= 9; i++)
            cube[i] = 'g';
        for (int i = 10; i <= 18; i++)
            cube[i] = 'r';
        for (int i = 19; i <= 27; i++)
            cube[i] = 'b';
        for (int i = 28; i <= 36; i++)
            cube[i] = 'o';
        for (int i = 37; i <= 45; i++)
            cube[i] = 'w';
        for (int i = 46; i <= 54; i++)
            cube[i] = 'y';
    }

    public static void clockWiseU() {
        // 윗면
        char tmp = cube[37];
        cube[37] = cube[39];
        cube[38] = cube[42];
        cube[39] = cube[42];

        cube[40] = cube[38];
//        cube[41] = cube[41];
        cube[42] = cube[44];

        cube[43] = tmp;
        cube[44] = cube[40];
        cube[45] = cube[43];

        // 사이드
        tmp = cube[1];
        cube[1] = cube[28];
        cube[2] = cube[29];
        cube[3] = cube[30];

        cube[10] = tmp;
        cube[11] = cube[2];
        cube[12] = cube[3];

        cube[19] = cube[10];
        cube[20] = cube[11];
        cube[21] = cube[12];

        cube[28] = cube[19];
        cube[29] = cube[20];
        cube[30] = cube[21];
    }

    public static void counterClockWiseU() {
        // 윗면
        char tmp = cube[37];
        cube[37] = cube[43];
        cube[38] = cube[40];
        cube[39] = cube[37];

        cube[40] = cube[44];
//        cube[41] = cube[41];
        cube[42] = cube[38];

        cube[43] = cube[45];
        cube[44] = cube[42];
        cube[45] = cube[39];

        // side
        tmp = cube[1];
        cube[1] = cube[10];
        cube[2] = cube[11];
        cube[3] = cube[12];

        cube[10] = cube[19];
        cube[11] = cube[20];
        cube[12] = cube[21];

        cube[19] = cube[28];
        cube[20] = cube[29];
        cube[21] = cube[30];

        cube[28] = tmp;
        cube[29] = cube[2];
        cube[30] = cube[3];
    }

    public static void clockWiseD() {
        // 아랫면
        char tmp = cube[46];

        cube[46] = cube[52];
        cube[47] = cube[49];
        cube[48] = tmp;

        cube[49] = cube[53];
//        cube[50] = cube[50];
        cube[51] = cube[47];

        cube[52] = cube[54];
        cube[53] = cube[51];
        cube[54] = cube[48];

        // side
        tmp = cube[7];
        cube[7] = cube[34];
        cube[8] = cube[35];
        cube[9] = cube[36];

        cube[16] = tmp;
        cube[17] = cube[8];
        cube[18] = cube[9];

        cube[25] = cube[16];
        cube[26] = cube[17];
        cube[27] = cube[18];

        cube[34] = cube[25];
        cube[35] = cube[26];
        cube[36] = cube[27];

    }

    public static void counterClockWiseD() {
        // 아랫면
        char tmp = cube[46];

        cube[46] = cube[48];
        cube[47] = cube[51];
        cube[48] = cube[54];

        cube[49] = cube[47];
//        cube[50] = cube[50];
        cube[51] = cube[53];

        cube[52] = tmp;
        cube[53] = cube[49];
        cube[54] = cube[52];

        // side
        tmp = cube[7];
        cube[7] = cube[16];
        cube[8] = cube[17];
        cube[9] = cube[18];

        cube[16] = cube[25];
        cube[17] = cube[26];
        cube[18] = cube[27];

        cube[25] = cube[34];
        cube[26] = cube[35];
        cube[27] = cube[36];

        cube[34] = tmp;
        cube[35] = cube[8];
        cube[36] = cube[9];
    }

    public static void clockWiseF() {
        // 앞면
        char tmp = cube[10];
        cube[10] = cube[16];
        cube[11] = cube[13];
        cube[12] = tmp;

        cube[13] = cube[17];
//        cube[14] = cube[14];
        cube[15] = cube[11];

        cube[16] = cube[18];
        cube[17] = cube[15];
        cube[18] = cube[12];

        // side
        tmp = cube[43];
        cube[43] = cube[9];
        cube[44] = cube[6];
        cube[45] = cube[3];

        cube[19] = tmp;
        cube[22] = cube[44];
        cube[25] = cube[45];

        cube[48] = cube[19];
        cube[47] = cube[22];
        cube[46] = cube[25];


        cube[9] = cube[48];
        cube[6] = cube[47];
        cube[3] = cube[46];
    }

    public static void counterClockWiseF() {
        // 앞면
        char tmp = cube[10];
        cube[10] = cube[12];
        cube[11] = cube[15];
        cube[12] = cube[18];

        cube[13] = cube[11];
//        cube[14] = cube[14];
        cube[15] = cube[17];

        cube[16] = tmp;
        cube[17] = cube[13];
        cube[18] = cube[16];

        // side
        tmp = cube[43];
        cube[43] = cube[19];
        cube[44] = cube[22];
        cube[45] = cube[25];

        cube[19] = cube[48];
        cube[22] = cube[47];
        cube[25] = cube[46];

        cube[48] = cube[9];
        cube[47] = cube[6];
        cube[46] = cube[3];


        cube[9] = tmp;
        cube[6] = cube[44];
        cube[3] = cube[45];
    }

    public static void clockWiseB() {

    }

    public static void counterClockWiseB() {

    }

    public static void clockWiseL() {
        char tmp = cube[1];
        cube[1] = cube[3];
        cube[1] = cube[3];
        cube[1] = cube[3];

        cube[1] = cube[3];

    }

    public static void counterClockWiseL() {

    }

    public static void clockWiseR() {

    }

    public static void counterClockWiseR() {

    }

    public static void printU() {
        for (int i = 37; i <= 45; i++) {
            System.out.print(cube[i]);
            if (i % 3 == 0) {
                System.out.println();
            }
        }
    }
}
