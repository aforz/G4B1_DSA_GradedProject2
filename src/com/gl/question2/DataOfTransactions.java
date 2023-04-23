package com.gl.question2;

public class DataOfTransactions {

    public static Node node;

    static Node head = null;
    static Node prev = null;

    static void ConvertBSTToSkewed(Node root) {
        if (root == null) {
            return;
        }
        ConvertBSTToSkewed(root.left);
        Node rightNode = root.right;

        //to check if the root Node of skewed tree is not defined
        if (head == null) {
            head = root;
            root.left = null;
            prev = root;
        } else {
            prev.right = root;
            root.left = null;
            prev = root;
        }
        ConvertBSTToSkewed(rightNode);
    }

    static void traverseRightSkewedRecursively(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");
        traverseRightSkewedRecursively(root.right);
    }

    public static void main(String args[]) {
        DataOfTransactions tree = new DataOfTransactions();
        DataOfTransactions.node = new Node(50);
        DataOfTransactions.node.left = new Node(30);
        DataOfTransactions.node.right = new Node(60);
        DataOfTransactions.node.left.left = new Node(10);
        DataOfTransactions.node.right.left = new Node(55);

        ConvertBSTToSkewed(node);
        traverseRightSkewedRecursively(head);
    }
}