package 백준.플래티넘.플래티넘5.Ex1708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Point root = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (root.y > y || root.y == y && root.x > x) {
                root = new Point(x, y);
            }

            list.add(new Point(x, y));
        }

        list.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int result = CCW(root, o1, o2);

                if (result > 0) {
                    return -1;
                } else if (result < 0) {
                    return 1;
                } else {
                    long distance1 = dist(root, o1);
                    long distance2 = dist(root, o2);

                    if (distance1 > distance2) {
                        return 1;
                    }
                }
                return -1;
            }
        });

        Stack<Point> stack = new Stack<>();
        stack.add(root);

        for (int i = 1; i < list.size(); i++) {
            while (stack.size() > 1 && (CCW(stack.get(stack.size() - 2), stack.get(stack.size() - 1), list.get(i)) <= 0)) {
                stack.pop();
            }
            stack.add(list.get(i));
        }
        System.out.println(stack.size());
    }

    static long dist(Point p1, Point p2) {
        return (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
    }

    static int CCW(Point p1, Point p2, Point p3) {
        long result = (p2.x - p1.x) * (p3.y - p1.y) - (p2.y - p1.y) * (p3.x - p1.x);
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    static class Point {
        long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
}
