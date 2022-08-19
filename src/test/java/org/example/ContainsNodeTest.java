package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsNodeTest {
    @Test
    void containsOne() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertTrue(testTree.containsNode(1));
    }

    @Test
    void containsTwo() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertTrue(testTree.containsNode(2));
    }

    @Test
    void containsThree() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertTrue(testTree.containsNode(3));
    }

    @Test
    void containsFour() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertTrue(testTree.containsNode(4));
    }

    @Test
    void containsFive() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertTrue(testTree.containsNode(5));
    }

    @Test
    void containsSix() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertTrue(testTree.containsNode(6));
    }

    @Test
    void containsSeven() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertTrue(testTree.containsNode(7));
    }

    @Test
    void containsEight() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertTrue(testTree.containsNode(8));
    }

    @Test
    void containsNine() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertTrue(testTree.containsNode(9));
    }

    @Test
    void containsTen() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertTrue(testTree.containsNode(10));
    }

    @Test
    void containsNodeNotInBST() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertFalse(testTree.containsNode(11));
    }

    @Test
    void containsNodeNotInBST2() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertFalse(testTree.containsNode(-1));
    }

    @Test
    void containsNodeNotInBST3() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertFalse(testTree.containsNode(0));
    }
}