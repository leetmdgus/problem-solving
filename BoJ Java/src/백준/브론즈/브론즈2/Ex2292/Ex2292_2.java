package 백준.브론즈.브론즈2.Ex2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2292_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int visitedRoomCount = 1;
        int roomNumber = 1;

        while(roomNumber < N) {
            roomNumber += 6 * visitedRoomCount++;
        }
        System.out.println(visitedRoomCount);
    }
}
