package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveNodeTest {
    @Test
    void removeOne() {
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
        testTree.removeNode(1);
        assertFalse(testTree.containsNode(1));
    }

    @Test
    void removeTen() {
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
        testTree.removeNode(10);
        assertFalse(testTree.containsNode(10));
    }

    @Test
    void removeThreeNodes() {
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
        assertTrue(testTree.containsNode(2));
        assertTrue(testTree.containsNode(3));
        testTree.removeNode(1);
        testTree.removeNode(2);
        testTree.removeNode(3);
        assertFalse(testTree.containsNode(1));
        assertFalse(testTree.containsNode(2));
        assertFalse(testTree.containsNode(3));
    }

    @Test
    void removeRootNode() {
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
        testTree.removeNode(5);
        assertFalse(testTree.containsNode(5));
    }

    @Test
    void removeNonExistentNode() {
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
        testTree.removeNode(11);
        assertFalse(testTree.containsNode(11));
    }

    @Test
    void removeRootWithTwoChildrenWhoAlsoHaveChildren() {
        BST testTree = new BST(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(5);
        testTree.insertNode(4);
        assertTrue(testTree.containsNode(3));
        testTree.removeNode(3);
        assertFalse(testTree.containsNode(3));
    }

    @Test
    void removeRootWithOnlyLeftChild() {
        BST testTree = new BST(3);
        testTree.insertNode(1);
        assertTrue(testTree.containsNode(3));
        testTree.removeNode(3);
        assertFalse(testTree.containsNode(3));
    }

    @Test
    void removeRootWithOnlyRightChild2() {
        BST testTree = new BST(3);
        testTree.insertNode(5);
        assertTrue(testTree.containsNode(3));
        testTree.removeNode(3);
        assertFalse(testTree.containsNode(3));
    }
}