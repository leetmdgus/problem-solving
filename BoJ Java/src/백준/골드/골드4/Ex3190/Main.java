package 백준.골드.골드4.Ex3190;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[][] isApple;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        isApple = new boolean[N + 1][N + 1];

        int K = Integer.parseInt(br.readLine());
        for (int i = 1; i <= K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int appleY = Integer.parseInt(st.nextToken());
            int appleX = Integer.parseInt(st.nextToken());
            isApple[appleY][appleX] = true;
        }


        M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int next = Integer.parseInt(st.nextToken());
        M--;

        Snake snake = new Snake();
        for (int i = 1; ; i++) {
            if (!snake.move()) {
                System.out.println(i);
                return;
            }

            if (next == i) {
                String order = st.nextToken();

                if (order.equals("D")) {
                    snake.turnRight();
                } else {
                    snake.turnLeft();
                }

                if (M > 0) {
                    st = new StringTokenizer(br.readLine());
                    next = Integer.parseInt(st.nextToken());
                    M--;
                }
            }
        }
    }

    static class Snake {
        char headState;

        Set<XY> snakeBodySet;
        Deque<XY> snakeLocDeq;

        public Snake() {
            headState = 'R';
            snakeBodySet = new HashSet<>();
            snakeLocDeq = new LinkedList<>();
            snakeLocDeq.addLast(new XY(1, 1));
        }

        boolean isEnd() {
            XY head = snakeLocDeq.peekFirst();

            if (head.x == 0 || head.y == 0 || head.x > N || head.y > N) return true;

            Iterator<XY> iterator = snakeBodySet.iterator();
            while (iterator.hasNext()) {
                XY now = iterator.next();

                if (now.x == head.x && now.y == head.y) {
                    return true;
                }
            }

            return false;
        }

        boolean move() {
            stretch();

            if (isEnd()) return false;

            XY head = snakeLocDeq.peekFirst();
            if (!isApple[head.y][head.x]) {
                XY tail = snakeLocDeq.removeLast();
                snakeBodySet.remove(tail);
            }
            isApple[head.y][head.x] = false;
            return true;
        }

        void stretch() {
            XY head = snakeLocDeq.peekFirst();
            snakeBodySet.add(head);

            switch (headState) {
                case 'L':
                    snakeLocDeq.addFirst(new XY(head.x - 1, head.y));
                    break;
                case 'R':
                    snakeLocDeq.addFirst(new XY(head.x + 1, head.y));
                    break;
                case 'U':
                    snakeLocDeq.addFirst(new XY(head.x, head.y - 1));
                    break;
                case 'D':
                    snakeLocDeq.addFirst(new XY(head.x, head.y + 1));
                    break;
            }
        }

        void turnLeft() {
            switch (headState) {
                case 'L':
                    headState = 'D';
                    break;
                case 'R':
                    headState = 'U';
                    break;
                case 'U':
                    headState = 'L';
                    break;
                case 'D':
                    headState = 'R';
                    break;
            }
        }

        void turnRight() {
            switch (headState) {
                case 'L':
                    headState = 'U';
                    break;
                case 'R':
                    headState = 'D';
                    break;
                case 'U':
                    headState = 'R';
                    break;
                case 'D':
                    headState = 'L';
                    break;
            }
        }
    }

    static class XY {
        int x, y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}