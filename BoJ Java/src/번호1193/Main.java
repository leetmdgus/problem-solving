package 번호1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Node{
    int numerator;
    int denominator;
    Node left;
    Node right;

    Node(int numerator, int denominator, Node left, Node right) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.left = left;
        this.right = right;
    }
}
class BinaryTree{
    Node root;
    BinaryTree(int nodeNumber) {
        Node[] nodes = new Node[]{};
        for(int i = 0; i<nodeNumber; i++) {
            nodes[i] = new Node(0,0, null, null);
        }
        for(int i = 0; i<nodeNumber; i++) {
            int left = 2 * i + 1;

            nodes[i].left = nodes[left];
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());


        int numerator = 0;
        int denominator = 0;

        int x = 0, y = 0;
        int length = 0;
        
        System.out.println(x +"/" + y);

    }
}
