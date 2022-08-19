package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertNodeTest {
    @Test
    void zeroIsRootInsertOne() {
        BST testTree = new BST(0);
        testTree.insertNode(1);
        assertEquals(testTree.rightChild.value, 1);
    }

    @Test
    void fiveIsRootInsertTenThenOne() {
        BST testTree = new BST(5);
        testTree.insertNode(10);
        testTree.insertNode(1);
        assertEquals(testTree.rightChild.value, 10);
        assertEquals(testTree.leftChild.value, 1);
    }

    @Test
    void zeroIsRootInsertOneThenTen() {
        BST testTree = new BST(0);
        testTree.insertNode(1);
        testTree.insertNode(10);
        assertEquals(testTree.rightChild.value, 1);
        assertEquals(testTree.rightChild.rightChild.value, 10);
    }

    @Test
    void tenIsRootInsertFiveThenOne() {
        BST testTree = new BST(10);
        testTree.insertNode(5);
        testTree.insertNode(1);
        assertEquals(testTree.leftChild.value, 5);
        assertEquals(testTree.leftChild.leftChild.value, 1);
    }

    @Test
    void fiveIsRootInsertOneThenTenThenThreeThenSeven() {
        BST testTree = new BST(5);
        testTree.insertNode(1);
        testTree.insertNode(10);
        testTree.insertNode(3);
        testTree.insertNode(7);
        assertEquals(testTree.leftChild.value, 1);
        assertEquals(testTree.rightChild.value, 10);
        assertEquals(testTree.leftChild.rightChild.value, 3);
        assertEquals(testTree.rightChild.leftChild.value, 7);
    }
}