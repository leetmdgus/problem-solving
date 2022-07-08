package 번호1991;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    String data;
    Node left;
    Node right;

    Node(String data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
class BinaryTree {
    Node root;
    BinaryTree(String data) {
        root = new Node(data, null, null);
    }

    public void preOrder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.data);
        if(node.left != null) {
            preOrder(node.left);
        }
        if(node.right != null) {
            preOrder(node.right);
        }
    }
    public void inOrder(Node node) {
        if(node == null) {
            return;
        }
        if(node.left != null) {
            inOrder(node.left);
        }
        System.out.print(node.data);
        if(node.right != null) {
            inOrder(node.right);
        }
    }
    public void postOrder(Node node) {
        if(node == null) {
            return;
        }
        if(node.left != null) {
            postOrder(node.left);
        }
        if(node.right != null) {
            postOrder(node.right);
        }
        System.out.print(node.data);
    }
    public Node searchNode(String data) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            if(current.data.equals(data)) {
                return current;
            }
            if(current.left != null) {
                queue.offer(current.left);
            }
            if(current.right != null) {
                queue.offer(current.right);
            }
        }
        return null;
    }

    public void addLeftNode(Node node, String data) {
        if(node.left == null) {
            node.left = new Node(data, null, null);
        }
    }
    public void addRightNode(Node node, String data) {
        if(node.right == null) {
            node.right = new Node(data, null, null);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();

        String node = scanner.next();
        String leftNode = scanner.next();
        String rightNode = scanner.next();
        BinaryTree bt = new BinaryTree(node);
        if(!leftNode.equals(".")) {
            bt.addLeftNode(bt.searchNode(node), leftNode);
        }
        if(!rightNode.equals(".")) {
            bt.addRightNode(bt.searchNode(node), rightNode);
        }
        repeat--;

        while(repeat > 0) {
            repeat--;
            node = scanner.next();
            leftNode = scanner.next();
            rightNode = scanner.next();
            if(!leftNode.equals(".")) {
                bt.addLeftNode(bt.searchNode(node), leftNode);
            }
            if(!rightNode.equals(".")) {
                bt.addRightNode(bt.searchNode(node), rightNode);
            }
        }

        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
        System.out.println();
    }
}

