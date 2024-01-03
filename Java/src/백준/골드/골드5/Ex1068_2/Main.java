package 백준.골드.골드5.Ex1068_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

class Node {
    int value;
    Integer parent;
    ArrayList<Node> child = new ArrayList<>();

    Node(int value, Integer parent) {
        this.value = value;
        this.parent = parent;
    }

    int removeChild(int num) {
        for(int i = 0; i<child.size(); i++) {
            if(child.get(i).value == num) {
                child.remove(i);
                return 1;
            }
        }
        return 0;
    }

    int getChildCount() {
        return child.size();
    }
}

class Tree {
    Node[] tree = new Node[50];
    Node root;

    Tree(int[] arr) {
        root = new Node(arr[0], null);
        for(int i = 1; i<arr.length; i++) {
            tree[i] = new Node(i, arr[i]);
        }
    }

    void remove(int val, Node parent) {
        ArrayList<Node> child = parent.child;

        for(int i =0 ;i< parent.getChildCount(); i++) {
            int succeedRemove = child.get(i).removeChild(val);
            if(succeedRemove == 1) {
                return;
            } else {
                remove(val, child.get(i));
            }
        }
    }

    int leaf () {
        int cnt = 0;
        Node node = root;

        Stack<Node> stack = new Stack<>();
        stack.add(node);

        while(!stack.isEmpty()) {
            node = stack.pop();

            if(node.getChildCount() == 0) {
                cnt ++;
                continue;
            }

            for(int i = 0; i<node.getChildCount(); i++) {
                stack.add(node.child.get(i));
            }
        }
        return cnt;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        Tree tree = new Tree(arr);

        int r = Integer.parseInt(br.readLine());

        tree.remove(r, tree.root);
        System.out.println(tree.leaf());
    }
}
