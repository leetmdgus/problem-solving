package 백준.브론즈.브론즈5.Ex17256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // a cake b = c = (a.z + b.x, a.y × b.y, a.x + b.z)
        //          = a.z + b.x ... cx
        //          = a.y * b.y ... cy
        //          = a.x + b.z ... cz


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        Cake a = new Cake(x, y, z);

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        z = Integer.parseInt(st.nextToken());

        Cake c = new Cake(x, y, z);

        int bx = c.x - a.z;
        int by = c.y / a.y;
        int bz = c.z - a.x;

        Cake b = new Cake(bx, by, bz);
        b.printCake();
    }

    static class Cake {
        int x, y, z;

        public Cake(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        void printCake() {
            System.out.println(x + " " + y + " " + z);
        }
    }
}
