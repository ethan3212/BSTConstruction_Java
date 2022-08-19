package org.example;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST(5);
        for(int i = 1; i < 5; i++) {
            tree.insertNode(i);
        }
        for(int i = 6; i < 11; i++) {
            tree.insertNode(i);
        }
        tree.displayTree();
        System.out.println(" ");
        tree.containsNode(1);
        tree.containsNode(5);
        tree.containsNode(10);
        tree.removeNode(1);
        tree.removeNode(5);
        tree.removeNode(10);
        tree.containsNode(1);
        tree.containsNode(5);
        tree.containsNode(10);
        tree.displayTree();
    }
}